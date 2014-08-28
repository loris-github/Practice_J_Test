
public class TestJava4_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		num=show_length(22,19);
		System.out.println("对角线长度="+num);
	}
	
	public static double show_length(int m,int n){
		return Math.sqrt(m*n+n*n);
	}
}
