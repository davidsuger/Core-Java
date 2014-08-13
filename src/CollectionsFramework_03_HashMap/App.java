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

		// ����Map��һ�ַ���
		// HashMap���ܱ�֤key-value�Ե�˳��
		// �ӿ� Map.Entry<K,V>,ӳ�����-ֵ�ԣ���Map.entrySet
		// ��������ӳ���collection��ͼ�����е�Ԫ�����ڴ��ࡣ
		// Map�ӿڵķ�����Set<Map.Entry<K,V>> entrySet()�����ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + " : " + value);
		}
	}

}
