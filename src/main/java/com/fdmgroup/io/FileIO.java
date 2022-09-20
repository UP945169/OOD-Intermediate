package com.fdmgroup.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.*;

public class FileIO {
	private Logger logger = LogManager.getLogger(FileIO.class);
		
//	public void writeLineToFile(String file, String line) {
//		
//		BufferedWriter bufferedWriter = null;
//		
//		try {
//			FileWriter fileWriter = new FileWriter(file, true);
//			bufferedWriter = new BufferedWriter(fileWriter);
//			bufferedWriter.write(line);
//			bufferedWriter.newLine();
//			System.out.println("Line written successfully");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bufferedWriter.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	// Try with resources
	public void writeLineToFile(String file, String line) {
		logger.debug("File is " + file + " , line is:  " + line);
		logger.trace("Entering writeLinetoFile method");
		try( FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
			logger.trace("Entering try block in writeLineToFile method");
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			logger.info("Line written to " + file);
			//System.out.println("Line written successfully");
		} catch(IOException e) {
			logger.error("Problem writing to file.");
			e.printStackTrace();
		}
	}
	
	public String readFile(String file) {
		String currentLine;
		StringBuffer fileContents = new StringBuffer();
		
		try(
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader)
		) {
			while((currentLine = bufferedReader.readLine()) != null) {
				fileContents.append(currentLine + "\n");
			}
		} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		return fileContents.toString();
	}
	
}
