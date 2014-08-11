package CollectionsFramework_05_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		// HashSet does not retain order.
		Set<String> hashSet = new HashSet<String>();

		// LinkedHashSet remembers the order you added items in
		Set<String> linkedHashSet = new LinkedHashSet<String>();

		// TreeSet sorts in natural order
		Set<String> treeSet = new TreeSet<String>();

		testSet(hashSet);
		testSet(linkedHashSet);
		testSet(treeSet);

		// treeSet2 contains some common elements with hashSet, and some new
		Set<String> treeSet2 = new TreeSet<String>();
		treeSet2.add("dog");
		treeSet2.add("cat");
		treeSet2.add("giraffe");
		treeSet2.add("monkey");
		treeSet2.add("ant");

		// ////////// Intersection //////////
		treeSet2.retainAll(hashSet);
		System.out.println("两个Set的交集：" + treeSet2);

		// treeSet3 contains some common elements with hashSet, and some new
		Set<String> treeSet3 = new TreeSet<String>();
		treeSet3.add("dog");
		treeSet3.add("cat");
		treeSet3.add("giraffe");
		treeSet3.add("monkey");
		treeSet3.add("ant");

		// ///////// Difference ////////////
		treeSet3.removeAll(hashSet);
		System.out.println("去掉两个Set的交集：" + treeSet3);
	}

	public static void testSet(Set<String> set) {

		if (set.isEmpty()) {
			System.out.println("Set is empty at start.");
		}

		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("snake");
		set.add("bear");

		if (set.isEmpty()) {
			System.out.println("Set is empty after adding (no!).");
		}

		// Adding duplicate items does nothing
		set.add("mouse");

		System.out.println(set.getClass());
		System.out.println(set);

		// /////// Iteration /////////
		for (String element : set) {
			System.out.println(element);
		}

		// ////// Does set contains a given item? ////////
		if (set.contains("bird")) {
			System.out.println("Contains bird");
		}
		if (set.contains("dog")) {
			System.out.println("Contains dog");
		}

	}

}
