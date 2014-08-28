
public class ArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,10,11,12,13};
		System.arraycopy(a1,0,a2,0,3);
		
		System.out.print("a1变为：");
		
		for (int i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
		
		System.out.print("\n"+"a2变为：");
		for (int j=0;j<a2.length;j++)
			System.out.print(a2[j]+" ");
	}

}
