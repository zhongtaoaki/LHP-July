package firstWeek;

/**
 * 
 * 声明变量
 * 变量不声明是不可以使用
 * 数据类型 变量名 = 初始值；
 * 
 * 数据类型 データタイプ
 * 基本数据类型
 *	整数 byte short int long
 *		java的整数类型是有正负的
 *		byte -128~127
 *		short 6w
 *		int 21亿 java里默认是int
 *		long 
 * 	小数  double double
 * 		 float
 * 	布尔 boolean
 * 		true false
 * 		默认是false
 *  字符 char
 *  	char和short相互转化
 *  
 *  数据类型的自动转化
 *  范围小的数据类型是可以自动转化为大范围的数据类型
 *  范围大的数据类型需要强制转化为小范围的数据类型
 *  	把小数转化成整数时候，会丢失小数部分大精度 只有【舍】
 *  
 * 引用数据类型
 * 
 * 字符串 String
 * 
 * 变量名
 * 可以用英文，数字，_ $
 * 开头不能使用数字
 * 变量名的命名规范
 * 首字母小写（java里面对于大小写敏感）
 * 小驼峰命名原则：从第二个单词开始每个单词的首字母要大写
 * 不可以使用java的关键词
 * 
 * java里面的 = 代表赋值
 * 把等号右边的值赋给等号左边的变量
 * 
 */
public class VariableDemo {

	public static void main(String[] args) {
		
		int i = 0;
		long j = 0;
		
		j = i;//向上转化
		i = (int)j;//向下转化
		
		double d = 1.7;
		i = (int)d ;//1
		
		char c = 1270;
		System.out.println(c);
		
		int word;
		int _word;
		int $word;
		int Word;
		int helloWorld;
	}
}
