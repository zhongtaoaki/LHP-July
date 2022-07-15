package firstWeek;

/**
 * 循环
 * 
 * DRY Dont Repeat Yourself
 * 
 * for(初始值;判断条件;i++){ 循环体 } 初始值的位置声明的变量的生效范围是这个循环内
 * 
 * 迭代器
 * 
 * 加强for 冒号前面的变量代表了冒号后面这个对象的元素 冒号后面现阶段必须是数组 冒号前面的变量的数据类型必须是这个数组的元素的数据类型 for(数据类型
 * 变量名 ：循环的对象){
 * 
 * }
 * 
 * while(boolean){ 循环内容 }
 * 
 * do while do{ }while()
 * 当while里的判断一次也不满足的时候，while是不会被执行的
 * 但是do while至少会被执行一次
 * 
 */
public class Roupe {

	public static void main(String[] args) {

		// [0-5)
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}

		int[] array = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
		}
		for (int i : array) {
			// System.out.println(i);
		}

		int[][] array2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				// System.out.println(array2[i][j]);
			}
		}
		for (int[] is : array2) {
			for (int i : is) {
				// System.out.println(is);
			}
		}

		String s = "0";
		System.out.println(s);
		int[] array3 = { 1, 2, 3 };
		System.out.println(array3);

		int i = 0;
		boolean flag = true;
		while(flag) {
			System.out.println(i++);
			if (i == 1000000) {
				continue;
			}
		}

//		while (i > array.length) {
//			System.out.println(array[i]);
//			i++;
//		}

//		do {
//			System.out.println(array[i]);
//			i++;
//		} while (i > array.length);

	}
}
