package CollectionsFramework_02_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayList manage arrays internally
		 * [0][1][2][3][4][5] ....
		 * ArrayList使用数组储存数据，取得数据使用数组index，所以很快。在后面加也很快，默认的大小是10，
		 * 当超过的时候会建一个两倍大小的数组然后把之前的数据拷贝进去。 如果在前面加数据，需要把数据整个移动，消耗很大，
		 * 如果是加在后面几位，移动的少所以也可以。
		 * 
		 * LinkedList consists of elements where each element
		 * has a reference to the previous and next element
		 * [0]<->[1]<->[2] ....
		 * 所以取得一个数据需要从第一个开始遍历比ArrayList花费要大一些。
		 * 
		 */
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	//基本规则是，如果只是要从List后面(或接近后面几位)增加或者删除item，使用Arraylist。
	//如果要从List任何位置增加或者删除item，使用LinkedList。
	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i <1E5 ; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		// Add items at the end of list
		for (int i = 0; i <1E5 ; i++) {
			list.add(i);
		}	
		long end = System.currentTimeMillis();
		System.out.println("Time taken add to the end: "+(end -start)+"ms for "+type);
		
		long start1 = System.currentTimeMillis();
		// Add items elsewhere in list
		for (int i = 0; i <1E5 ; i++) {
			list.add(0,i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("Time taken add elsewhere in list: "+(end1 -start1)+"ms for "+type);

		long start2 = System.currentTimeMillis();
		// Add items near the end of list
		for (int i = 0; i <1E5 ; i++) {
			list.add(list.size()-100,i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("Time taken add near the end of list: "+(end2 -start2)+"ms for "+type);
	}
}
