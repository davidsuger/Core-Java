package CollectionsFramework_01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		// Retrieve
		System.out.println(numbers.get(0));

		System.out.println("\nIteration #1: ");
		// Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Removing items (carefull)
		numbers.remove(numbers.size() - 1);

		// This is VERY slow
		numbers.remove(0);

		System.out.println("\nIteration #2: ");
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		//List interface
		List<String> values = new ArrayList<String>(); 

	}
}
