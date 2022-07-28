package thirdWeek;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class LambdaDemo {

	public static void main(String[] args) {

		List<String> list = List.of("satou", "kojima", "satou", "tanaka", "suzuki", "tanaka", "ueno");

//		for (String string : list) {
//			System.out.println(string);
//		}

//		list.forEach(System.out::println);
//
//		list.forEach(e -> System.out.println(e));

		list.stream().filter(e -> e.length() > 5).forEach(System.out::println);

	}
}
