package firstWeek;

/**
 * 方法
 * 
 * 方法的声明 修饰符 返回值 方法名（形式参数列表）{ 方法体 }
 *
 * 修饰符 访问修饰符 非访问修饰符 static
 * 
 * 返回值 返回值的数据类型（基础数据类型 引用数据类型 void） 如果返回值不是void 必须要在方法体中写上return
 * 
 * 方法名 小驼峰命名原则
 * 
 * 形式参数列表（入参，引数、パラメータ） 不需要参数的时候就不用写 可以写一个或者多个（变量的声明） 数据类型 变量名，数据类型 变量名，数据类型 变量名
 * 变量之间是有顺序 这个变量的生命周期在方法的大括号内
 * 
 * 方法的声明在类内方法外 方法的使用在方法内 在现阶段直接在方法内用方法名（）的方法去使用
 *
 * 方法的意义
 * 1. 代码太多了之后需要整理
 * 把类似的处理，相关的处理整理到一个方法，提高代码的【可读性】
 * 2. DRY dont repeat yourself
 * 提高代码的复用性
 * 3. 代码的可维护性 解耦
 * 4. 通过代码的分离，可以让程序员专注在某一个小细节上，上写代码变得轻松一点
 * 
 * Java对于调用方法的人传进来的参数是会进行检测
 * 1. 数据类型
 * 2. 参数的个数
 * 3. 每个参数的顺序
 * 不检测变量名
 * 
 * 尽可能得把错误发生在早的阶段
 */
public class MethodDemo {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5};
		printArray(array);
		
		int[] array2 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int[] array3 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int[] array4 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int[] array5 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int[] array6 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		
		printArray(array);
		printArray(array2);
		printArray(array3);
		printArray(array4);
		printArray(array5);
		printArray(array6);
	}

	static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i);
		}

	}
	
	
}
