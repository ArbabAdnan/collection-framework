package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {
		 ArrayList<String> names = new ArrayList<String>();
	        names.add("Durgesh");
	        names.add("Sitara");
	        names.add("Roshni");
	        names.add("Vandna");
	        names.add("Vandna");
	        
	        //for each loop
	        for(String str:names) {
	        	System.out.print(str +"\t"+str.length()+"\t");
	        	StringBuffer buffer= new StringBuffer(str);
	        	System.out.println(buffer.reverse());
	        }
	        
	        System.out.println("_______________________________");
	        
	        //traversing using Iterator: Forward traversing
	      Iterator<String> iterator =  names.iterator();
	      
	      while(iterator.hasNext()) {
	    	String next = iterator.next();
	    	System.out.println(next);
	      }
	      
	      System.out.println("____++++____________________+++__________");
	      //traversing using Iterator: Forward traversing
	     ListIterator<String> itr = names.listIterator(names.size());
	     
	     
	     while(itr.hasPrevious()) {
	    	String pre = itr.previous();
	    	System.out.println(pre);
	     }
	     
	     //Enumeration
	     
	     
	     System.out.println("++++++++++++For Each Method+++++++++++++++++++++++++");
	     //for each method jave 8 feature
	     
	     names.forEach(e->{
	    	 System.out.println(e);
	     });
	    
	     System.out.println("+++++++++++++++++++++++");
	     
	     System.out.println("Sorting of Elements");
	     System.out.println("");
	     
	     TreeSet<String> set = new TreeSet<>();
	     set.addAll(names);
	     set.forEach(e->{
	    	 System.out.println(e);
	     });
	     //comparale 
	     //comperatale
	}

}
