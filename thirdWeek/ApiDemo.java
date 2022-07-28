package thirdWeek;

import java.math.BigDecimal;
import java.util.List;

public class ApiDemo {

	public static void main(String[] args) {
		
		BigDecimal number1 = new BigDecimal(1.2);
		BigDecimal number2 = new BigDecimal(1.2);
		
		number1.add(number2);
		
		int i = 1;
		Integer integer1 = new Integer(10);
		Integer integer2 = 127;
		i = integer2;
		Integer integer3 = Integer.valueOf(127);//flyweight 享元设计模式
		Integer integer4 = Integer.parseInt("10");
		
		System.out.println(integer2 == integer3);
	}
}
