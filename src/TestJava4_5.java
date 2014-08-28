import java.util.Arrays;


public class TestJava4_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {74,585,7,23737,38,74,16,58,69,98};
		
		System.out.print("数组排序前的排序: ");
		for(int i= 0; i<a.length;i++)
			System.out.print(a[i]+" ");
		
		Arrays.sort(a);
		System.out.print("\n 数组排序后的顺序: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
