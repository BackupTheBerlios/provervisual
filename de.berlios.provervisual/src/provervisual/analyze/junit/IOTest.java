package provervisual.analyze.junit;

import junit.framework.TestCase;
import java.io.*;
import java.util.*;
import java.util.zip.*;

import provervisual.analyze.IO;

public class IOTest extends TestCase {
	
	public IOTest(String name){
		super(name);
	}

	private static final File TMP = new File(System.getProperty("java.io.tmpdir"));
	private static final String FS = new String(System.getProperty("file.separator"));
	
	// Set up the test environment
	private File dir = new File(TMP+FS+"test"+FS+"io");
	private File dir2 = new File(TMP+FS+"test"+FS+"io2");
	private File dirzip = new File(TMP+FS+"test"+FS+"io.zip");
	private File filezip = new File(TMP+FS+"test"+FS+"ziptest.zip");
	private File onefile = new File(TMP+FS+"test"+FS+"test.zip");
	private File test1 = new File(TMP+FS+"test"+FS+"io"+FS+"test1.txt");
	private File test2 = new File(TMP+FS+"test"+FS+"io"+FS+"test2.txt");
	private File test3 = new File(TMP+FS+"test"+FS+"io"+FS+"test3.txt");
	private File test4;
	private Vector <String>zipfiles = new Vector<String>();
	
	/* 
	 * Create the testdata
	 */
	protected void setUp() throws Exception {
		super.setUp();

		dir.mkdirs();
		dir2.mkdirs();
		test1.createNewFile();
		test2.createNewFile();
		test3.createNewFile();
		dirzip.createNewFile();
		filezip.createNewFile();
		
		zipfiles.add(test1.getPath());
		zipfiles.add(test2.getPath());
		
	}

	/* 
	 * Delete the testdata
	 */
	protected void tearDown() throws Exception {
		super.tearDown();

		test1.delete();
		test2.delete();
		test3.delete();

		if(dirzip.exists())
			dirzip.delete();
		
		if(filezip.exists())
			filezip.delete();

		if(onefile.exists())
			onefile.delete();

		dir.delete();
		dir2.delete();
		
	}
	
	public void testZip(){
		assertTrue(IO.zip(test1,onefile) == 0);
		assertTrue(IO.zip(dir, dirzip) == 0);
		assertTrue(checkEntries(dirzip, 3));
		assertTrue(checkEntries(onefile,1));
	}
	
	public void testZipFiles(){
		assertTrue(IO.zipFiles(zipfiles, filezip) == 0);
		assertTrue(checkEntries(filezip, 2));
	}
	
	public void testCopyFileTo(){
		
		test4 = new File(TMP+FS+"test"+FS+"io"+FS+"test4.txt");
		assertTrue(IO.copyFileTo(test1.getPath(), test4.getPath()));
		assertTrue(test4.exists());
		test4.delete();
		
	}
	
	public void testCopyRecursive(){
		
		File tmp = new File(dir2.getPath()+"/io");
		assertTrue(IO.copyRecursive(dir.getPath(),dir2.getPath()));
		assertTrue(IO.copyRecursive(dir.getPath(),tmp.getPath()));
		assertTrue(dir2.list().length == 4);
		assertTrue(tmp.list().length == 3);
		
	}
	
	public void testDeleteDir(){
		
		assertTrue(dir2.exists());
		assertTrue(IO.deleteDir(dir2));
		assertFalse(dir2.exists());
		
	}
	
	public void testStringToFile(){
		
		String tmp = new String("Hallo Test1! \r\nTest2");
		assertTrue(IO.stringToFile(tmp,test1));
		assertTrue(test1.length() == 20L);
		
	}
	
	public void testSearchStringInFile(){
		
		String tmp = new String("Hallo Test1! \r\nTest2");
		assertTrue(IO.stringToFile(tmp,test1));
		
		assertTrue(IO.searchStringInFile(new File(TMP+""+FS+"test"+FS+"io"+FS+"test1.txt"),"Test2",true));
		assertTrue(IO.searchStringInFile(test1,"test2",false));
		assertFalse(IO.searchStringInFile(test1,"test2",true));
		assertFalse(IO.searchStringInFile(test1,"Test3",false));

	}
	
	public void testFileToString(){
		
		String tmp = new String("Hallo Test1! \r\nTest2");
		assertTrue(IO.stringToFile(tmp,test1));
		
		assertTrue(IO.fileToString(test1).equals(tmp));

	}

	public void testReplace(){
		
		String tmp = new String("Hallo Test1! \r\nTest2");
		assertTrue(IO.stringToFile(tmp,test1));
		
		assertTrue(IO.replace(test1,test3,"Test1","Test3"));
		assertTrue(IO.searchStringInFile(test3,"Test3",true));
		assertFalse(IO.searchStringInFile(test3,"Test1",true));
		assertTrue(test1.length() == 20L);
		
		
	}
	
	
	/** Helper method to check entries of a zip file
	 * @param file The name of the zipfile
	 * @param number The number of the files in the zipfile
	 * @param name The name of the file to check
	 * @return True if the zipfile seems to be ok 
	 */
	private boolean checkEntries(File file, int number){

		int elements = 0;
		
		try {
			ZipFile zip = new ZipFile(file);

			for ( Enumeration e = zip.entries(); e.hasMoreElements(); )
			{
			  e.nextElement();
			  elements++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}		
		if (elements == number)
			return true;
		else 
			return false;
	}
	
}
