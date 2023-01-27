package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		
		Vector<String> vector = new Vector<String>();
		name.add("adnan");
		name.add("khan");
		name.add("kasi");
		name.add("arham");
		name.add("farhan");
		vector.addAll(name);
		
		System.out.println("Vector "+ vector);
	}

}
