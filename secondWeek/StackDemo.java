package secondWeek;

public class StackDemo {

	public static void main(String[] args) {
		
		int[][] a = {{1,1},{2,2}};
		int[][] b = {{3,3},{2,2}};
		
		
		
//		for (int i = 0; i < b.length; i++) {
//			a[i] = b[i]; 
//		}
		
		//a = b;
		//a = b.clone();
		
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i].clone();
		}
		
		a[0][0] = 4;
		
//		System.out.println(a[0][0]);
//		System.out.println(b[0][0]);
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
	}
}
