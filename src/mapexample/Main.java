package mapexample;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> courses= new HashMap<>();
		
		courses.put("php", 3000);
		courses.put("java", 8000);
		courses.put("core java", 2000);
		courses.put("python", 6000);
		courses.put("machine lerning",1000);
		System.out.println(courses+"\n");
		
		courses.forEach((key,value)->{
			System.out.print(key);
			System.out.print(" => ");
			System.out.println(value);
			System.out.println();
			
			
		});
	}

}
