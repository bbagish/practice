package com.automation.FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileAndStoreIntoString {
	public static String f2s (String filePath) throws IOException{
		 File file = new File(filePath);
	    Scanner input = new Scanner(file);
	    String ss = "";
	    while (input.hasNext()) {
	        ss += input.nextLine();
	    }
	    return ss;
	}

}
