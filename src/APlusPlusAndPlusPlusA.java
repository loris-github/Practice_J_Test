class Test{		
	int num1=4,num2,num3=4,num4;
		
	void aplus(){
		num2 = num1 ++;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
		
	void plusa(){
		num4 = ++ num3;
		System.out.println("num3 = "+num3);
		System.out.println("num4 = "+num4);				
	}
}

public class APlusPlusAndPlusPlusA {	
	public static void main(String[] args) {
		Test t = new Test();
		t.aplus();
		t.plusa();	
	}
}
