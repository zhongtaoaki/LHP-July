package firstWeek;

public class ScopeDemo {

	public static void main(String[] args) {
		
		int i = 2;
		int j = method(i++);
		System.out.println(i++);
		
	}
	
	static int method(int i) {
		return i++;
	}
}
