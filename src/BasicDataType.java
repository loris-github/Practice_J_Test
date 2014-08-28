
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
		System.out.println("LONG的范围："+"("+long_min+","+long_max+") "+"8字节，64位");
		System.out.println("INT的范围： "+"("+int_min+","+int_max+") "+"4字节，32位");			
		System.out.println("SHORT的范围："+"("+short_min+","+short_max+") "+"2字节，16位");	
		System.out.println("BYTE的范围："+"("+byte_min+","+byte_max+") "+"1字节，8位");
		System.out.println("FLOAT的范围："+"("+float_min+","+float_max+") "+"4字节，32位");
		System.out.println("DOUBLE的范围："+"("+double_min+","+double_max+") "+"8字节，64位");
		System.out.println("Boolean status的状态是："+!status);
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
