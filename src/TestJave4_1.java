import java.math.BigInteger;


public class TestJave4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "-1195";
		BigInteger src1 = new BigInteger(a,10);
		System.out.println(src1.toString(2));
		
		BigInteger src2 = new BigInteger(src1.toString(2),2);
		System.out.println(src2.toString(10));
		
		}
		
		
}

