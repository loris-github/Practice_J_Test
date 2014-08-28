class Person3{
	String name;
	int age;
	
	Person3(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	boolean Compare(Person3 p){
		if(this.name.equals(p.name)&&(this.age == p.age)){
			return true;
		}
		else{
			return false;
		}
	}
}



public class TestCpmpare {

	public static void main(String[] args) {
		Person3 p1 = new Person3("sdfsdf",393);
		Person3 p2 = new Person3("sdfsdf",393);
		
		System.out.print(p1.Compare(p2));

	}

}
