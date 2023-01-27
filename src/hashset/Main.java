package hashset;


import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Double> set = new HashSet<Double>();
		
		set.add(22.33);
		set.add(23.66);
		set.add(66.00);
		set.add(222.77);
		set.add(1.77);
		set.add(7.77);
		
		System.out.println(set);
		 
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(set);
		System.out.println(tset);
		
	}

}
