package JavaPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromNp {

	public static void main(String[] args) throws FileNotFoundException {
		
		String Flocation  =  "C:\\Users\\prave\\OneDrive\\Desktop\\praveen.txt";
		
		File Np = new File(Flocation);
		Scanner rdata = new Scanner(Np);
		
		while(rdata.hasNextLine()) {
			System.out.println(rdata.nextLine());
		} 
		
		System.out.println("No lines read more");

	}

}
