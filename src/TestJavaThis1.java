class Person5{
	String name;
	int age;
	
	public Person5(){
		System.out.println("1.public Person5()");
	}
	
	public Person5(String name,int age){
		this();   //this() �൱�� �޲ι��췽����������ڵ�һ��
		this.name = name;
		this.age = age;
		
		System.out.println("2.public Person5(String name,int age)");
	}
	
	public void talk(){
		System.out.println("�ҽУ�"+this.name+"�����䣺"+this.age+"��");
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
