package thirdWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Student类 5名学生，让他们去考试 如果这个学生是第一次来，把new出来之后放到map里 如果不是第一次了就直接使用
 * 
 * Map<String, Student> map = new HashMap<>();
 */
public class MapDemo {

	public static void main(String[] args) {

		List<String> testList = List.of("satou", "kojima", "satou", "tanaka", "suzuki", "tanaka", "ueno");

		Map<String, Student> map = new HashMap<>();
		for (String name : testList) {
			if (map.containsKey(name)) {
				map.get(name).test();
			} else {
				map.put(name, new Student(name));
				map.get(name).test();
			}
		}

		Set<String> keys = map.keySet();//得到一个hashmap的key的set集合

		for (String string : keys) {
			System.out.println(map.get(string));
		}

		Set<Entry<String, Student>> entries = map.entrySet();//得到一个hashmap的键值对的set集合
		
		for (Entry<String, Student> entry : entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}

class Student {

	public String name;
	public int age;
	public int score;

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
	}

	public void test() {
		System.out.println(name + ": test start....");
	}

	@Override
	public String toString() {

		return name;
	}
}
