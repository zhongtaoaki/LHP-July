package firstWeek;

/**
 * 
 * 方法的重载 overload
 * 重载是两个方法之间的关系
 * 
 * 重载的条件：
 * 方法名一致，方法签名不一致的两个方法形成了重载
 * 方法签名 = 方法名（参数）
 * 参数不一致
 * 1. 数据类型不一样
 * 2. 顺序不一样
 * 3. 个数不一样
 *
 */
public class OverloadDemo {

	public static void main(String[] args) {

		// 求一个正方形的面积
		int a = 9;
		System.out.println("正方形的面积： " + getArea(a));

		// 求一个长方形的面积
		int b = 4;
		int c = 5;
		System.out.println("长方形的面积： " + getArea(b,c));
	}

	static int getArea(int a) {
		return a * a;
	}

	static int getArea(int b, int c) {
		return b * c;
	}
	
	static double getArea(double b) {
		return b ;
	}
	
	static int getArea(int b, double c) {
		return (int)b ;
	}
	
	static int getArea(double b, int c) {
		return (int)b ;
	}

}
