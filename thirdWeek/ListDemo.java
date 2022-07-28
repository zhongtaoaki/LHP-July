package thirdWeek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Iterable的接口
 * Collection的接口
 * List是一个接口
 * ArrayList是一个实体类
 * ArrayList和数组没有关系，算法相同
 * 查找一个元素的时候使用的这个元素的下标
 * 
 * ArrayList（数组）
 * LinkedList（链表）
 * 都是实装了List这个接口的实体类
 * 
 * ArrayList
 * LinkedList
 * Stack
 * 
 */
public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.add(2, null);
		
		list.remove("abcd");
		list.remove(0);
		System.out.println(list.get(0));
		
		list.size();
		list.clear();
		list.forEach(null);
		list.indexOf("a");
		List.of();
		
		Stack stack;
	}

}
