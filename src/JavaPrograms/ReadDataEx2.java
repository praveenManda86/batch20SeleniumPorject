package JavaPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataEx2 {

	public static void main(String[] args) throws IOException {
		
		String Flocation  =  "C:\\Users\\prave\\OneDrive\\Desktop\\praveen.txt";
		
		BufferedReader np = new BufferedReader(new FileReader(Flocation));
		
		String st;
		
       while((st=np.readLine())!= null)
    	   System.out.println(st);
	}

}
