package secondWeek;

/**
 * 类 类的声明 修饰符 class 类名{
 * 
 * }
 * 
 * 访问修饰符 アクセス修飾子 private 本类可以访问 // default 在本包内可以访问 不写 // protected 子类可以访问 //
 * public 所有类都可以访问 //
 * 
 * class的命名 大驼峰命名原则 首字母大写，之后每个单词的首字母都要大写
 * 
 * 类的使用 通过new一个类的实例（对象）使用类的内容 类名 对象名 = new 类名();
 * 
 * 类的内容 成员变量（フィールド 属性） 访问修饰符 数据类型 变量名； 不准写不带访问修饰符的变量
 * 
 * 方法(メソッド) 修饰符（访问修饰符 + 非访问修饰符） 返回值类型 方法名（入参）{}
 * 
 * 构造方法（构造器 コンストラクター） 访问修饰符 类名（入参）{ } 本质上有返回值但是不写，且不能加return 每一个类是有一个默认的无参空构造
 * 一旦你认为的写了一个构造器，默认的无参空构造就失效了
 * 
 * 成员变量和方法的使用 对象名.变量名/方法名
 * 
 * 继承关系 表达抽象度 子类（サブクラス sub） extends 父类/超类（親クラス、スーパークラス super） 子类可以继承父类的非私有属性和方法
 * 子类不需要额外定义父类中已有的属性和方法，复制了一份 子类里可以去调用父类的属性和方法
 * 
 * this super this调用自己的成员变量 super调用父类的成员变量 this和super的本质是一个对象 也可以指代构造方法
 * 
 * 重写(オーバライド) 条件 方法名要一样，入参要一样（数据类型要一致，个数要一致，顺序要一致），返回值要一样，子类的访问范围要大于或等于父类的访问权限
 * 
 * 多态 条件： 1. 两个类拥有继承关系 2. 出现了方法的重写 3. 父类引用指向子类
 * 
 * 
 */
public class ClassDemo {

	public static void main(String[] args) {

		Animal ergou = new Cat("二狗");
		Animal wangcai = new Dog("旺财");
		Animal mimi = new Cat("咪咪");
		Animal laifu = new Dog("来福");
		
		Animal[] animals = new Animal[4];
		animals[0] = ergou;
		animals[1] = wangcai;
		animals[2] = mimi;
		animals[3] = laifu;
		
		for (Animal animal : animals) {
			animal.bite();
		}
		
		Cat cat1 = new Cat("ergou");
		Cat cat2 = new Cat("ergou");
		
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));

	}
}

class Cat extends Animal {

	public Cat() {
	}

	public Cat(String name) {
		this.name = name;
	}

	public Cat(String name, int age) {
		this(name);
		this.age = age;
	}

	public void bite() {
		System.out.println(this.name + "喵"); // 0
	}
	
	@Override
	public boolean equals(Object obj) {
		Cat cat = (Cat) obj;
		return cat.name.equals(this.name);
	}
}

class Dog extends Animal {
	public Dog(String name) {
		this.name = name;
	}

	public void bite() {
		System.out.println(this.name + "汪");
	}
}

class Animal {
	public String name;
	public int age;

	public void bite() {
		System.out.println(name + "叫"); // 1
	}
}
