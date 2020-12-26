package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {

	public static void main(String[] args) {
	
		HashMap <Integer,String>  mp = new HashMap <Integer, String>  ();
		
       mp.put(4, "praveen");
       mp.put(2, "deepika");
       mp.put(6, "Sai");
       mp.put(1, "mounika");
       mp.put(5, "Sravan");  
       mp.put(3, "Pavani");
 
     for (Map.Entry s : mp.entrySet() ) {
    	 System.out.println(s.getKey() +"  " +  s.getValue());
     }
  	
	}

}
