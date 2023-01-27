package untypesafe;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
	//	2)Un Type safe- different types of elements can be added to collection
		
		LinkedList list = new LinkedList();
		
		list.add("khan");
		list.add(22);
		list.add(34);
		list.add(35);
		
		System.out.println(list);
		
	}

}
