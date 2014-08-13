package CollectionsFramework_03_HashMap;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		map.put(1, "Six");

		String text = map.get(1);

		System.out.println(text);

		// 遍历Map的一种方法
		// HashMap不能保证key-value对的顺序
		// 接口 Map.Entry<K,V>,映射项（键-值对）。Map.entrySet
		// 方法返回映射的collection视图，其中的元素属于此类。
		// Map接口的方法：Set<Map.Entry<K,V>> entrySet()，返回此映射中包含的映射关系的 Set 视图。
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + " : " + value);
		}
	}

}
