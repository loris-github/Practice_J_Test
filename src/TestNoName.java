class Person{
	public String name;
	public int age;
	public String talk(){
		return "���ǣ�"+name+"�����꣺"+age+"��";
	}
}

public class TestNoName {

	public static interface IPerson
	{
		String talk();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println( new IPerson () {
			@Override
			public String talk()
			{
				return "hahaha";
			}
		}.talk());
		
		System.out.println(new Person().talk());

	}

}
