package JavaPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextNP {

	public static void main(String[] args) throws IOException {
	
	String Flocation  =  "C:\\Users\\prave\\OneDrive\\Desktop\\Hello.txt";
	
	File np = new File(Flocation); 
	
	np.delete();

	}

}
