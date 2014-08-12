package CollectionsFramework_07_Sorting_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + " : " + id;
	}
}

class StringLengthComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		if (len1 > len2) {
			return 1;
		}
		if (len1 < len2) {
			return -1;
		}
		return 0;
	}
}

class AlphabeticalComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}

public class App {

	public static void main(String[] args) {

		// ////////// Sorting Strings ///////////////////
		List<String> animals = new ArrayList<String>();

		animals.add("elephant");
		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");

		System.out.println("\nSort by natual ordering:");
		Collections.sort(animals);
		for (String string : animals) {
			System.out.println(string);
		}

		System.out.println("\nSort by string length:");
		Collections.sort(animals, new StringLengthComparator());
		for (String string : animals) {
			System.out.println(string);
		}

		System.out.println("\nSort by Alphabetical:");
		Collections.sort(animals, new AlphabeticalComparator());
		for (String string : animals) {
			System.out.println(string);
		}

		System.out.println("\nSort by ReverseAlphabetical:");
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		for (String string : animals) {
			System.out.println(string);
		}

		// ////////// Sorting Numbers ///////////////////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(5);
		numbers.add(6);

		Collections.sort(numbers, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}

		});
		for (Integer integer : numbers) {
			System.out.println(integer);
		}

		// //////////Sorting Numbers ///////////////////
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Jack"));
		people.add(new Person(5, "Bob"));
		people.add(new Person(2, "David"));
		people.add(new Person(8, "Sam"));
		people.add(new Person(10, "Adobe"));

		// Sort in order of id
		Collections.sort(people, new Comparator<Person>() {

			public int compare(Person o1, Person o2) {
				return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
			}

		});
		System.out.println("\nSorted by id:");
		for (Person person : people) {
			System.out.println(person);
		}

		// Sort in order of name
		Collections.sort(people, new Comparator<Person>() {

			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});
		System.out.println("\nSorted by name:");
		for (Person person : people) {
			System.out.println(person);
		}
	}

}
