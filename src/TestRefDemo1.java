class Person1{
	String name;
	int age;
}

public class TestRefDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = null;
		Person1 p2 = null;
		p1 = new Person1();
		p1.name ="sdfsdf";
		p1.age = 234;
		p2 = p1;
		System.out.println("ĞÕÃû£º"+p2.name);
		System.out.println("ÄêÁä£º"+p2.age);
		p1 = null;
	}

}
