
public class Testjava4_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int_sum;
		double double_sum;
		int_sum = add(3,5);
		System.out.println("int_sum = add(3,5)��ֵ�ǣ�"+int_sum);
		int_sum = add(3,5,6);
		System.out.println("int_sum = add(3,5,6)��ֵ�ǣ�"+int_sum);
		double_sum =add(3.2,6.5);
		System.out.println("int_sum = add(3.2,6.5)��ֵ�ǣ�"+double_sum);
	}
	
	public static int add(int x,int y){
		return x+y;
	}
	
	public static int add(int x,int y,int z){
		return x+y+z;
	}
	
	public static double add(double x,double y){
		return x+y;
	}

}
