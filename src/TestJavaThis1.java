class Person5{
	String name;
	int age;
	
	public Person5(){
		System.out.println("1.public Person5()");
	}
	
	public Person5(String name,int age){
		this();   //this() 相当于 无参构造方法，并需放在第一行
		this.name = name;
		this.age = age;
		
		System.out.println("2.public Person5(String name,int age)");
	}
	
	public void talk(){
		System.out.println("我叫："+this.name+"，年龄："+this.age+"岁");
	}
}
public class TestJavaThis1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person5 p = new Person5("sdfsdf",34);
		p.talk();

	}

}
