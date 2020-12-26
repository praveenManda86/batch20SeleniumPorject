package OOPSConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateExample {

	public static void main(String[] args) {
		
		Date d = new Date();  
		System.out.println(d);
		
		SimpleDateFormat B = new SimpleDateFormat("dd-MMMM-yyyy");
		
		String Dat = B.format(d);
		
		System.out.println(Dat);

	}

}
