package firstWeek;


/**
 * 
 * 运算符号
 * 
 * 算术运算符
 * 	+-*%除
 * 
 * 赋值运算符
 * = *= += -= %= ++ --
 * i++ 先取值，再计算
 * ++i 先计算，再取¥值
 * 
 * 比较运算符
 * == > < != <= >=
 * 比较运算符的运算结果是boolean
 * 
 * 逻辑运算符 
 * 运算对象是boolean 0 1
 * 运算结果也是boolean
 * && || & | !
 * && || 可以提升运行效率（performance）
 * && || 减少代码出错的概率（健壮性）
 */
public class OperatorDemo {

	public static void main(String[] args) {
		
		int i = 9;
		
		System.out.println(i++);
		System.out.println(++i);
		
		int j = 3;
		int k = i % j;
		
		//1001
		//1002
		//1003
		//--
		//1007
		int number = 1001;
		int group = number % 3;
		
		boolean t = true;
		boolean f = false;
		
		boolean and = f && t; //false
		
		boolean or = t || f; //true
		
		
	}
}
