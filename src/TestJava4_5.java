import java.util.Arrays;


public class TestJava4_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {74,585,7,23737,38,74,16,58,69,98};
		
		System.out.print("��������ǰ������: ");
		for(int i= 0; i<a.length;i++)
			System.out.print(a[i]+" ");
		
		Arrays.sort(a);
		System.out.print("\n ����������˳��: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
