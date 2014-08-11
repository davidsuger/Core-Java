package CollectionsFramework_04_Sorted_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		// LinkedHashMap 按插入顺序排序
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// TreeMap 按键的自然顺序排序，或者根据创建映射时提供的 Comparator 进行排序
		Map<Integer, String> treeHashMap = new TreeMap<Integer, String>();

		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeHashMap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");

		// Adding duplicate items does nothing
		map.put(1, "giraffe");
		System.out.println(map.getClass());
		// 遍历Map的另外一种方法
		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + " : " + value);
		}
	}
}
