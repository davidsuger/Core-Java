package CollectionsFramework_10_Using_Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		// Java 5 之前使用的方法 iterator, 但是iterator可以在迭代的时候删除元素
		Iterator<String> iterator = animals.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			if (string.equals("cat")) {
				iterator.remove();
			}
		}

		// Modern iteration, Java 5 and later
		for (String animal : animals) {
			System.out.println(animal);

			// 迭代的时候不能删除，否则抛出ConcurrentModificationException异常
			// animals.remove(2);
		}

	}
}
