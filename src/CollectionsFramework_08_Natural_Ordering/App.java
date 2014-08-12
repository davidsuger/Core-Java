package CollectionsFramework_08_Natural_Ordering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public int compareTo(Person o) {
		// 虽然name是private的，但是在自己类里面所有考研访问
		// return -name.compareTo(o.name);

		if (name.length() < o.name.length()) {
			return -1;
		}
		if (name.length() > o.name.length()) {
			return 1;
		}
		return name.compareTo(o.name);
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();

		addElements(list);
		addElements(set);

		Collections.sort(list);
		showElements(list);

		System.out.println();
		showElements(set);
	}

	private static void addElements(Collection<Person> collection) {
		collection.add(new Person("joe"));
		collection.add(new Person("adam"));
		collection.add(new Person("sue"));
		collection.add(new Person("mike"));
		collection.add(new Person("david"));
	}

	private static void showElements(Collection<Person> collection) {
		for (Person person : collection) {
			System.out.println(person);
		}
	}
}
