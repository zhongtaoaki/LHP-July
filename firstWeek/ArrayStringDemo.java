package firstWeek;

/**
 * 引用数据类型（参照型） 
 * String
 * array
 * 类
 * 接口
 * 枚举
 * 
 * String
 * 
 * 数组的声明
 * int[] 变量名 = {1,2,3,4};
 * 数组会有多个元素，每个元素的数据类型是一致的
 * 数组的长度就不可变了
 * 数组的元素是可以改变的
 * int[] 变量 = new int[1000];
 * 
 * 数组的使用
 * 变量名[index]
 * 下标从 0开始，到数组长度-1的位置结束
 * 如果使用的下标超过了数组长度，会在运行阶段触发
 * ArrayIndexOutOfBoundsException
 * 数组越界异常
 * 数组的元素的数据类型可以是任意数据类型
 * String[]
 * 
 * 数组的元素的数据类型也可以是数组，二维数组
 * int[][] 变量名 = {{1,2,3},{4,5,6}}; 
 * 二维数组的长度依然是不可变的
 * 每个最底层数据的元素的数据类型必须是一致的
 * 
 * 二维数组也可以通过new的方式声明
 * int[][] 变量名 = new int[4][];
 * 通过这种方式声明的二维数组，每个元素数组的长度并未指定，长度可以不一致
 * int[][] 变量名 = new int[4][5];
 * 通过这种方式声明的二维数组，每个元素数组的长度已经指定，长度必须一致
 * 
 * 
 */
public class ArrayStringDemo {

	public static void main(String[] args) {
		
		int i = 0;
		char c = 'a';
		
		//System.out.println(i);
	
		String s = i + "";
		
		int[] array1 = {1,2,3,4};
		int[] array2 = new int[4];
		
		System.out.println(array1[0]);
		array1[4] = 5;
		System.out.println(array1[0]);
		
		int[][] array3 = {{1,2,3},{4,5,6}}; 
		array3[0][2] = 0;
		
		int[][] array4 = new int[4][];
		array4[0] = new int[4];
		
	}
}
