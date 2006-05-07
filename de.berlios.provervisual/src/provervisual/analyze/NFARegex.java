package provervisual.analyze;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import provervisual.FinalState;
import provervisual.InitialState;
import provervisual.Operation;
import provervisual.Protocol;
import provervisual.impl.ProtocolImpl;

import jpaul.DataStructs.Factory;
import jpaul.DataStructs.MapWithDefault;
import jpaul.DataStructs.Pair;
import jpaul.Graphs.LabeledDiGraph.LabeledForwardNavigator;
import jpaul.RegExps.NFA;
import jpaul.RegExps.RegExp;

/**
 * Converts an NFA as represented in xmi of the diagram into an equivalent
 * regular expression. The regular expression is minimized. The convertion is
 * done by the package jpaul from http://jpaul.sourceforge.net
 */
public class NFARegex {

	Protocol protocol; 
	NFA<Object, String> nfa;
	
	public static void main(String args[]){
		URI uri = URI
		.createFileURI("/home/frank/runtime-de.berlios.provervisual/test/simple.provervisual");

		Logger logger = Logger.getLogger("default");
		
		ProtocolImpl protocol = new ProtocolImpl(uri);
		logger.info(protocol.toString());
	}
	
	public NFARegex(Protocol protocol){
		this.protocol = protocol;
		nfa = createNFA(protocol);
	}

	private NFA<Object, String> createNFA(Protocol protocol){
		
		EList states = protocol.getStates();
		provervisual.State initState = null;
		HashSet <Object>finalStates = new HashSet<Object>();
		HashSet <Object>actionStates = new HashSet<Object>();
		for(Iterator i = states.iterator(); i.hasNext();){
			Object element = i.next();
			provervisual.State state = (provervisual.State) element;
			if(state instanceof InitialState){
				initState = state;
			}else if(state instanceof FinalState){
				finalStates.add(state);
			}else{
				actionStates.add(element);
			}
		}
		
		EList operations = protocol.getOperations();
		
		Map<Object, List<Pair<Object, String>>> node2arcs = this.<Object, String> makeNode2Arcs();
		
		for(Iterator i = operations.iterator(); i.hasNext();){
			
			Operation op = (Operation) i.next() ;
			
			addTrans(node2arcs, op.getStartState(), "<"+op.getOperationAbbrev()+">", op.getEndState() );
			
		}
		
		NFA<Object, String> nfa = makeNFA(initState, new HashSet<Object>(finalStates),
				node2arcs);
		
		return nfa;
	}
	
	private <State, Label> Map<State, List<Pair<State, Label>>> makeNode2Arcs() {
		return new MapWithDefault<State, List<Pair<State, Label>>>(
				new Factory<List<Pair<State, Label>>>() {
					public List<Pair<State, Label>> create() {
						return new LinkedList<Pair<State, Label>>();
					}

					public List<Pair<State, Label>> create(
							List<Pair<State, Label>> l) {
						throw new Error();
					}
				}, true);
	}

	// Adds the edge/transition <s1, label, s2>
	private <State, A> void addTrans(
			Map<State, List<Pair<State, A>>> node2edges, State s1, A label,
			State s2) {
		List<Pair<State, A>> edges = node2edges.get(s1);
		edges.add(new Pair<State, A>(s2, label));
	}

	private <State, A> NFA<State, A> makeNFA(State begin,
			Set<State> acceptStates,
			final Map<State, List<Pair<State, A>>> state2edges) {

		return NFA.<State, A> create(begin, acceptStates,
				new LabeledForwardNavigator<State, A>() {
					@Override
					public List<Pair<State, A>> lnext(State s) {
						return state2edges.get(s);
					}
				});
	}

	public RegExp getRegExp() {

		return nfa.toRegExp();
		
	}

	public RegExp getSimpleRegExp() {

		NFA<NFA.BigState<NFA.BigState<NFA.BigState<Object>>>, String> simplifiedNFA = nfa
		.simplify().simplify().simplify();
		
		return simplifiedNFA.toRegExp();

	}
		
	public boolean toFile(File destination){
		
		StringBuffer text = new StringBuffer();
		text.append("PROTOCOL_TYPE="+protocol.getType()+"\n\n");
		
		text.append("OPERATION_ABBREVIATION\n");

		EList operations = protocol.getOperations();
		
		for(Iterator i = operations.iterator(); i.hasNext();){
			
			Operation op = (Operation) i.next();
			
			// Operation parameter definition only with full names at the moment
			text.append(op.getOperationAbbrev()+" ");
			text.append(op.getOperationName()+"\n");
			
			/* TODO: Implement different operation parameters 
			 * Not included in diagram editor at the moment

			text.append(op.getOperationName()+"(");
			
			for(Iterator j = op.getOperationParameter().iterator(); j.hasNext();){
				String pa = (String) j.next();
				text.append(pa);
				if(j.hasNext())
					text.append(",");
			}
			text.append(")\n");
			
			 */
			
		}
		
		text.append("\nALLOWED_SEQUENCE\n");
		text.append(protocol.getRegEx());
		
		IO.stringToFile(text.toString(), destination);
		
		return true;
		
	}
	
	
}
