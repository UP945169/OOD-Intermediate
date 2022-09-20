package com.fdmgroup.io;

public class Runner {

	public static void main(String[] args) {
		String file = "C:\\Temp\\file.txt";
		String line = "This is a line of text";
		
		FileIO fileIO = new FileIO();
		fileIO.writeLineToFile(file, line);

		String fileContents = fileIO.readFile(file);
		System.out.println(fileContents);
	}

}
