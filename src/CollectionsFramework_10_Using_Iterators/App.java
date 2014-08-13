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

		// Java 5 ֮ǰʹ�õķ��� iterator, ����iterator�����ڵ�����ʱ��ɾ��Ԫ��
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

			// ������ʱ����ɾ���������׳�ConcurrentModificationException�쳣
			// animals.remove(2);
		}

	}
}
