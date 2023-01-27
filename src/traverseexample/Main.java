package traverseexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names =new ArrayList<>();
		
		names.add("farhan");
		names.add("mirwaise");
		names.add("zakir");
		names.add("reki");
		names.add("kamran");
		names.add("adnan");
		
		System.out.println("FOR EACH LOOP "+"\n");
		for(String str :names) {
			System.out.print(str+ " \t"+str.length()+"\t");
			StringBuffer buffer = new StringBuffer(str);
			System.out.println(buffer.reverse());
		}
		
		System.out.println("\n traversing using Iterator: Forward traversing \n");
		
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		System.out.println("\n traversing using Iterator: Forward traversing \n");
		ListIterator<String> iterator2 = names.listIterator(names.size());
		while(iterator2.hasPrevious()) {
			String pre = iterator2.previous();
			System.out.println(pre);
		}
		
		System.out.println("\n for each method jave 8 feature \n ");
		
		names.forEach(e->{
			System.out.println(e);
		});
		
		
		  System.out.println("\n Sorting of Elements \n");
		     System.out.println("");
		     
		     TreeSet<String> set = new TreeSet<>();
		     set.addAll(names);
		     set.forEach(e->{
		    	 System.out.println(e);
		     });
	}

}
