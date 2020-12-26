package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex2 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Praveen");
		list.add("Praveen1");
		list.add("Praveen2");
		list.add("Praveen3");

		for (String var : list) {
			System.out.println(var);
		}

	}

}
