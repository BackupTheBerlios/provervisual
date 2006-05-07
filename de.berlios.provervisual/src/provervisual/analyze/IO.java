package provervisual.analyze;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO {

	protected static final int BLKSIZ = 8192;
	
	/** Use this method to zip whole directories.
	 * @param source The name of the directory to be zipped.
	 * @param dest The zipfile to be created
	 * @return 0 if zipping was sucessfull, -1 otherwise
	 */
	public static int zip(File source, File dest, Logger loggername){

		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;

		// File zipfileName = new File(file.getAbsolutePath() +".zip");
		
		// If the file is not a directory no recursive zipping is necessary
		if(source.isFile()){
			
			Vector <String>vec = new Vector<String>();
			vec.add(source.getAbsolutePath());
			logger.fine("Source is only a single file: "+source);
			zipFiles(vec ,dest);
			
		}
		
		// Zip all files in the directory
        if(source.isDirectory()){

	        try {
				ZipOutputStream out = new ZipOutputStream(new FileOutputStream(dest));
				logger.fine("Source is a directory: "+source);
				zipDir(source.getAbsolutePath(),out);
				out.flush();
				out.close();
				
	        } catch (Exception e) {
				logger.severe(e.getMessage());
				return -1;
			}

        }
		
		logger.fine("All files successfully zipped");
		return 0;
	}
	
	/**
	 * @see #zip(File, File, Logger)
	 */
	public static int zip(File source, File dest){
		return zip(source,dest,null);
	}
	
	
	/** Use this method if you want to zip files from different directories or
	 *  if you want to exclude some files from a directory. If you want to zip a whole
	 *  directory use @see IO#zipDirectory(File)
	 * @param source A java.util.Vector containing all filenames (as absolute path String!) to be zipped.
	 * @param dest The name of the created zipfile.
	 * @return 0 if the zipfile was successfully created, -1 otherwise
	 */
	public static int zipFiles(Vector<String> source, File dest, Logger loggername){

		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;
		
	    // Create a buffer for reading the files
	    byte[] buf = new byte[1024];
	    
   
	    try {
	        // Create the ZIP file
	        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(dest));
	    
	        // Compress the files
	        Iterator<String> it = source.iterator();
	        while(it.hasNext()) {
	        	
	        	String entry = it.next();
	            
	        	FileInputStream in = new FileInputStream(entry);
	    
	            // Add ZIP entry to output stream.
	        	logger.fine("Zipping file "+entry);
	            out.putNextEntry(new ZipEntry(entry));
	    
	            // Transfer bytes from the file to the ZIP file
	            int len;
	            while ((len = in.read(buf)) > 0) {
	                out.write(buf, 0, len);
	            }
	    
	            // Complete the entry
	            out.closeEntry();
	            in.close();
	        }
	    
	        // Complete the ZIP file
	        out.close();
	    } catch (IOException e) {
	    	logger.severe(e.getMessage());
	    	return -1;
	    }
	    
	    logger.fine("All files successfully zipped");
		return 0;
	    
	}
	
	/**
	 * @see #zipFiles(Vector, File, Logger)
	 */
	public static int zipFiles(Vector<String> source, File dest){
		return zipFiles(source,dest,null);
	}
	
	
	/** Used to zip recursive directories.
     * @param dir2zip The directory to be zipped.
     * @param zos An OutputStream to the zipfile.
     */
    private static void zipDir(String dir2zip, ZipOutputStream zos) {

		try {
			//create a new File object based on the directory we have to zip File    
			File zipDir = new File(dir2zip);
			//get a listing of the directory content 
			String[] dirList = zipDir.list();
			byte[] readBuffer = new byte[2156];
			int bytesIn = 0;
			//loop through dirList, and zip the files 
			for (int i = 0; i < dirList.length; i++) {
				File f = new File(zipDir, dirList[i]);
				if (f.isDirectory()) {
					//if the File object is a directory, call this 
					//function again to add its content recursively 
					String filePath = f.getPath();
					zipDir(filePath, zos);
					//loop again 
					continue;
				}
				//if we reached here, the File object f was not a directory 
				//create a FileInputStream on top of f 
				FileInputStream fis = new FileInputStream(f);
				//create a new zip entry 
				ZipEntry anEntry = new ZipEntry(f.getPath());
				//place the zip entry in the ZipOutputStream object 
				zos.putNextEntry(anEntry);
				//now write the content of the file to the ZipOutputStream 
				while ((bytesIn = fis.read(readBuffer)) != -1) {
					zos.write(readBuffer, 0, bytesIn);
				}
				//close the Stream 
				fis.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	


	/** A copy method which uses the new nio features from java 1.4
	 * @param source The source file
	 * @param destination The destination file
	 * @param logger A java.util.logging.Logger element to write the output
	 * @return 0 if copy was succesfull, -1 otherwise
	 */
	public static boolean copyFileTo(Logger loggername, String source, String destination){

		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;
		
		File src = new File(source);
		
		// check if the source files exists
		if(! src.exists() && ! src.canRead()){
			logger.severe(src+ " does not exists or is not readable");
			return false;
		}
		
		try {

			//Create parent folders
			File dest = new File(destination);
			if (! dest.exists()){
				File folder = dest.getParentFile();
				folder.mkdirs();
			}
		
			//Create channel on the source
			FileChannel srcChannel = new FileInputStream(src).getChannel();

			//Create channel on the destination
			FileChannel dstChannel = new FileOutputStream(dest).getChannel();

			//Copy file contents from source to destination
			dstChannel.transferFrom(srcChannel, 0, srcChannel.size());

			//Close the channels
			srcChannel.close();
			dstChannel.close();
			
			return true;
			} catch (IOException ioEx) {
				logger.severe("Copying "+src+" to "+destination+" failed");
				logger.severe(ioEx.getMessage());
				return false;
			}
	}
	
	/**
	 * @see #copyFileTo(Logger, String, String)
	 */
	public static boolean copyFileTo(String source, String destination){
		
		return copyFileTo(null, source, destination);

	}
	
	/** A copy method which transfers all files from an directory to another
	 * @param loggername A Logger object to which the output is directed
	 * @param src the source directory
	 * @param destination the destination directory
	 * @return true if copy finished successfully
	 */
	public static boolean copyRecursive(Logger loggername, String source, String destination){

		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;
		
		try {
			File src = new File(source);
			
			//Create parent folders
			File dest = new File(destination);
			if (! dest.exists()){
				if(dest.isFile()){
					new File(dest.getParent()).mkdirs();
				}else{
					dest.mkdirs();
				}
			}
			
			String [] files = null;
			
			if(src.isDirectory()){
				files = src.list();
			}
			
			if(files != null){
				for (int i=0; i<files.length; i++){
			
					if(new File(source+System.getProperty("file.separator")+files[i]).isFile()){
						//Create channel on the source
						File in = new File(source+System.getProperty("file.separator")+files[i]);
						logger.fine("Infile: "+source+System.getProperty("file.separator")+files[i]);
						FileChannel srcChannel = new FileInputStream(in).getChannel();

						//Create channel on the destination
						File out = new File(destination+System.getProperty("file.separator")+files[i]);
						logger.fine("Outfile: "+destination+System.getProperty("file.separator")+files[i]);
						FileChannel dstChannel = new FileOutputStream(out).getChannel();

						//Copy file contents from source to destination
						dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
				
						//Close the channels
						srcChannel.close();
						dstChannel.close();
					}else
						copyRecursive(logger, source+System.getProperty("file.separator")+files[i], destination+System.getProperty("file.separator")+files[i] );
				}
			}else{
				logger.warning("Directory is empty");
			}
			return true;
			
			} catch (IOException ioEx) {
				logger.severe("Copying "+source+" to "+destination+" failed");
				logger.severe(ioEx.getMessage());
				return false;
			}
	}	

	/**
	 * @see #copyRecursive(Logger, String, String)
	 */
	public static boolean copyRecursive(String source, String destination){

		return copyRecursive(null, source, destination);
		
	}
	
    /** Tries to delete all files and subdirectories under dir.
     * @param loggername The Logger object to which all output is directed
     * @param dir The directory to be deleted
     * @return true if all deletions were successful, false otherwise
     */
    public static boolean deleteDir(Logger loggername, File dir) {
    	
		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;
    	
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(logger, new File(dir, children[i]));
                if (!success) {
                	logger.severe("Cannot delete directory: "+dir);
                    return false;
                }
            }
        }
        // The directory is now empty so delete it
        return dir.delete();
    }
	
    
    /**
     * @see #deleteDir(Logger, File)
     */
    public static boolean deleteDir(File dir) {
    
    	return deleteDir(null, dir);
    	
    }

	/** Write the content of a String to a new file
	 * @param loggername The Logger object to which all output is directed
	 * @param output The String containing the content
	 * @param file The filename to which the output is written
	 * @return true if the content was successully written to the file, false otherwise
	 */
	public static boolean stringToFile(Logger loggername, String output, File file){
		
		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;

		try 
		{
			if (!file.exists()) 
			{
				logger.info("Create new file " + file);
				file.createNewFile();
			}
			Writer wf = new FileWriter(file);
			wf = new BufferedWriter(wf);
			wf.write(output);
			wf.close();
			return true;
		} 
		catch (IOException ioex) 
		{
			logger.severe(ioex.getMessage());
			return false;
		}
	}

	/**
	 * @see #stringToFile(Logger, String, File)
	 */
	public static boolean stringToFile(String output, File file){

		return stringToFile(null, output, file);
		
	}

	/** Reads a whole file (Textfile) into a single String element
	 * @param loggername The Logger object to which all output is directed
	 * @param file The file from which we read
	 * @return A String containing the file content
	 */
	public static String fileToString(Logger loggername, File file){
		
		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;

		try 
		{
			if (!file.exists()) 
			{
				logger.severe("File does not exist!");
				return null;
			}
			Reader is = new FileReader(file);
			StringBuffer sb = new StringBuffer();
			char[] b = new char[BLKSIZ];
			int n;
			while ((n = is.read(b)) > 0) sb.append(b, 0, n);
			return sb.toString();

		} 
		catch (IOException ioex) 
		{
			logger.severe(ioex.getMessage());
			return null;
		}

	}

	/**
	 * @see #fileToString(Logger, File)
	 */
	public static String fileToString(File file){
		
		return fileToString(null, file);

	}
	

	/** This method replace a specific String with another String. The Input
	 *  is a file. The Ouput is also a file 
	 * @param loggername The Logger object to which all output is directed
	 * @param input The input file
	 * @param output The output file
	 * @param replace The String to be replaced
	 * @param with The new String
	 * @return true if the String was successfully replaced and written to
	 *  the output file. 
	 */
	public static boolean replace(Logger loggername, File input, File output, String replace, String with) {
		
		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;

		StringBuffer sb = null;
		String temp = fileToString(logger, input);
		if (temp != null) {

			boolean found = false;
			int start = 0;
			int stop = 0;

			while ((start = temp.indexOf(replace, stop)) != -1) {
				found = true;
				stop = start + replace.length();
				sb = new StringBuffer(temp.length() + with.length()
						- replace.length());
				sb.append(temp.substring(0, start));
				sb.append(with);
				sb.append(temp.substring(stop, temp.length()));
				temp = sb.toString();
				stop += with.length() - replace.length();
			}

			String out = sb.toString();
			if (found && stringToFile(logger, out, output)) {
				logger.info("Replace of "+replace+" with "+with+" in File "+output+" successfull");
				return true;
			} else {
				logger.severe("Replace went wrong");
				return false;
			}

		} else {
			return false;
		}
	}

	/**
	 * @see #replace(Logger, File, File, String, String)
	 */
	public static boolean replace(File input, File output, String replace, String with) {

		return replace(null, input, output, replace, with);
		
	}
	
	/** This method searches for a specific String in a given file. The search 
	 *  can be case sensitive
	 * @param loggername The Logger to which the output is directed
	 * @param f The input file in which we search the input
	 * @param searchTerm The String to be searched
	 * @param caseSensitive true if the search should be case sensitive
	 * @return true if the String was found in the file
	 */
	public static boolean searchStringInFile (Logger loggername, File f, String searchTerm, boolean caseSensitive){
		
		Logger logger = loggername == null ? Logger.getLogger("default") : loggername;
		
		int bufSize = 2048;
		byte buf[] = new byte[bufSize];
		byte[] searchBytesLC = (caseSensitive) ? searchTerm.getBytes() : searchTerm.toLowerCase().getBytes();
		byte[] searchBytesUC = (caseSensitive) ? searchTerm.getBytes() : searchTerm.toUpperCase().getBytes();
		int sbLen = searchBytesLC.length;
		
		boolean retVal = false;
		int sbPos = 0;
		int len = 0, i = 0;
		
		try
		{
			FileInputStream fr = new FileInputStream(f);
			//byte buf[] = new byte[bufSize];
			while ((len = fr.read(buf, 0, bufSize)) >= 0) {
				for (i = 0; i < len; i++) {
					if ((buf[i] == searchBytesLC[sbPos]) || 
						(buf[i] == searchBytesUC[sbPos])) {
						sbPos++;
						if (sbPos == sbLen) {
							retVal = true;
							fr.close();
							return true;
						}
					} else {
						sbPos = 0;
					}
				}
			}
			fr.close();
		} catch (Exception e) {
			logger.severe("Error searching " + f + ": " + e);
		}
		
		return retVal;
	}
	
	/**
	 * @see #searchStringInFile(Logger, File, String, boolean)
	 */
	public static boolean searchStringInFile (File f, String searchTerm, boolean caseSensitive){

		return searchStringInFile(null, f, searchTerm, caseSensitive);
		
	}
}