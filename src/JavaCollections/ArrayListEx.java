package JavaCollections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Eno");
		list.add("ECity");
		list.add("Ename");
		list.add("EDesig");
		list.add("ESal");
		list.add("ESal");
		
		System.out.println(list.size());
		
		for (String Name: list ) {
			System.out.println(Name);
		}

	}

}
