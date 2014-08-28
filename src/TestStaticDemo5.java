class Person6{
	public Person6()
	{
		System.out.println("1.pbulic Person()");
	}
	
	static{
		System.out.println("2.Person 类的静态代码块被调用！");
	}
}
public class TestStaticDemo5 {
	
	static{
		System.out.println("3.TestStaticDemo5类的静态代码块被调用!");
	}
	
	public static void main(String[] args) {
		System.out.println("4.程序开始执行！");
		new Person6();
		new Person6();

	}

}
