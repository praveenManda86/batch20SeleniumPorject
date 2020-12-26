package JavaPrograms;

import java.io.*;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
	
	File np = new File ("C:\\Users\\prave\\OneDrive\\Desktop\\praveen1.txt");
	
	if(np.createNewFile()) {
		System.out.println("Yes File is Created =" + np.getName());
	} else {
		System.out.println("File alredy exist with same name ");
	}

	}

}
