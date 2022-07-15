package firstWeek;

/**
 * 
 * if if (condition 条件) {
 * 
 * }
 * 
 * if else if (condition 条件) {
 * 
 * }else(){
 * 
 * }
 * 
 * else if
 * 
 * 条件的本质是一个变量 boolean
 * 
 */
public class IFdemo {

	public static void main(String[] args) {

		int i = 5;

		if (i == 1) {
			System.out.println("这是第1组");
		} else if (i == 2) {
			System.out.println("这是第2组");
		} else if (i == 3) {
			System.out.println("这是第3组");
		} else if (i == 4) {
			System.out.println("这是第4组");
		} else if (i == 5) {
			System.out.println("这是第5组");
		} else {
			System.out.println("你不是我们班的");
		}

		// 整数（除了long）字符串 字符 枚举
		switch (i) {
		case 1:
			System.out.println("这是第1组");
			break;
		case 2:
			System.out.println("这是第2组");
			break;
		case 3:
			System.out.println("这是第3组");
			break;
		case 4:
			System.out.println("这是第4组");
			break;
		case 5:
			System.out.println("这是第5组");
			break;
		default:
			System.out.println("你不是我们班的");
			break;
		}

	}
}
