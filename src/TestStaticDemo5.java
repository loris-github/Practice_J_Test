class Person6{
	public Person6()
	{
		System.out.println("1.pbulic Person()");
	}
	
	static{
		System.out.println("2.Person ��ľ�̬����鱻���ã�");
	}
}
public class TestStaticDemo5 {
	
	static{
		System.out.println("3.TestStaticDemo5��ľ�̬����鱻����!");
	}
	
	public static void main(String[] args) {
		System.out.println("4.����ʼִ�У�");
		new Person6();
		new Person6();

	}

}
