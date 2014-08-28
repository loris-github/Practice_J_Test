class MyFibonacci {
	
	public MyFibonacci(int n){		
		long a[] = new long[n];
		int y = 0;
		
		if (n<1){
			System.out.println("wrong input!!");
		}
		
		else if (n==1||n==2){		
			for(int i=0;i<=(n-1);i++){
				a[i] = 1;
			}
		}
		
		else {
			
			a[0]=a[1]=1;
			
			for(int i=2;i<=(n-1);i++){

				a[i] = a[i-1] + a[i-2];
			}		
		}
		
		for(long x: a){
			System.out.print(x+" ");
			y++;
			if(y>10&&(y%10==0))				
			System.out.println("");	

		}

	}
	

	
}

public class Test2 {

	public static void main(String[] args) {

		new MyFibonacci(333);
		
	}

}
