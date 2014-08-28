
public class TestJava4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,min,max;
		int A[]={74,48,30,17,62};
		
		min=max=A[0];
		
		System.out.print("数组A： ");
		
		for(i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
			if (min>A[i])
				min=A[i];
			else if (max<A[i])
				max=A[i];
			
		}
		System.out.println("\n数组的最大值是："+max);
		System.out.println("数组的最小值是："+min);
	}

}
