package firstWeek;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println(calcCircleArea(5));
	}

	static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

	static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

}
