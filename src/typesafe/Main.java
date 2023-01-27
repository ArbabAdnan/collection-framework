package typesafe;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		  // 1)Type Safe- same type of elements(objects) are added to collection
		ArrayList<String> name = new ArrayList<String>();
		
		
		name.add("adnan");
		name.add("khan");
		name.add("kasi");
		name.add("arham");
		name.add("farhan");
		
		System.out.println(name);
		//get
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		name.clear();
		
		
		
	
		
		
	}

}
