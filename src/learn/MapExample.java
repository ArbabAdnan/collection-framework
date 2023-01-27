package learn;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> courses = new HashMap<>();
		//adding element
		courses.put("core java", 4000);
		courses.put("python", 5000);
		courses.put("spring", 6000);
		courses.put("andriod", 7000);
		courses.put("php", 8000);
		
		System.out.println(courses);
		
		courses.forEach((key,value)->{
			System.out.print(key);
			System.out.print("=>");
			System.out.println(value);
			System.out.println();
		});
	}

}
 