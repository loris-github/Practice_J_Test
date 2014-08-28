
public class BasicDataType {

	long long_max = java.lang.Long.MAX_VALUE;
	long long_min = java.lang.Long.MIN_VALUE;
	
	int int_max = java.lang.Integer.MAX_VALUE;
	int int_min = java.lang.Integer.MIN_VALUE;
	
	short short_max = Short.MAX_VALUE;
	short short_min = Short.MIN_VALUE;
	
	byte byte_max = Byte.MAX_VALUE;
	byte byte_min = Byte.MIN_VALUE;
	
	float float_min = Float.MAX_VALUE;
	float float_max = Float.MIN_VALUE;
	
	double double_min = Double.MAX_VALUE;
	double double_max = Double.MIN_VALUE;
	
	boolean status = true;
	
	void myPrint (){
		System.out.println("LONG�ķ�Χ��"+"("+long_min+","+long_max+") "+"8�ֽڣ�64λ");
		System.out.println("INT�ķ�Χ�� "+"("+int_min+","+int_max+") "+"4�ֽڣ�32λ");			
		System.out.println("SHORT�ķ�Χ��"+"("+short_min+","+short_max+") "+"2�ֽڣ�16λ");	
		System.out.println("BYTE�ķ�Χ��"+"("+byte_min+","+byte_max+") "+"1�ֽڣ�8λ");
		System.out.println("FLOAT�ķ�Χ��"+"("+float_min+","+float_max+") "+"4�ֽڣ�32λ");
		System.out.println("DOUBLE�ķ�Χ��"+"("+double_min+","+double_max+") "+"8�ֽڣ�64λ");
		System.out.println("Boolean status��״̬�ǣ�"+!status);
	}
	
	void howToProcessDataOverflow(){
		System.out.println("int_max="+int_max);
		System.out.println("int_max + 1 ="+(int_max+1));
		System.out.println("int_max + 2 ="+(int_max+2L));
		System.out.println("int_max + 3 ="+((long)int_max+3));
	}
	
	void dataAssignment(){
		
	}
	
	public static void main(String[] args) {
		BasicDataType BDT = new BasicDataType();
		BDT.myPrint();
		BDT.howToProcessDataOverflow();

	}

}
