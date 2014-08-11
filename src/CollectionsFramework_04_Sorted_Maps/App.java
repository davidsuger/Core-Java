package CollectionsFramework_04_Sorted_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		// LinkedHashMap ������˳������
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// TreeMap ��������Ȼ˳�����򣬻��߸��ݴ���ӳ��ʱ�ṩ�� Comparator ��������
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
		// ����Map������һ�ַ���
		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + " : " + value);
		}
	}
}
