
public class TestJava4_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]={7,3,8,19,6,22,78,13};
		largest(score);
	}
	
	public static void largest(int a[]){
		int i,temp=a[0];
		for(i=0;i<a.length;i++){
			if(a[i]>temp)
			temp = a[i];			
		}
		
		System.out.println("数组中最大值是： "+temp);
		
	}
}
