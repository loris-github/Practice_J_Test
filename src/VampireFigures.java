
public class VampireFigures {
	static void findOut(int a,int b,int c,int d,int e){
		if(
			a==(b*10+c)*(d*10+e)||
			a==(b*10+c)*(e*10+d)||
			
			a==(b*10+d)*(c*10+e)||
			a==(b*10+d)*(e*10+c)||
			
			a==(b*10+e)*(b*10+c)||
			a==(b*10+e)*(c*10+b)||
			
			a==(c*10+b)*(d*10+e)||
			a==(c*10+b)*(e*10+d)||
			
			a==(d*10+b)*(c*10+e)||
			a==(d*10+b)*(e*10+c)||
			
			a==(e*10+b)*(c*10+d)||
			a==(e*10+b)*(d*10+c)
			
			){
			System.out.println(a);
		}
			
	}
	
	public static void main(String[] args) {
		int f,g,h,i;

		for (int j=1000;j<=9999;j++){
			
			i=j%10;
			h=(j%100-i)/10;
			g=(j%1000-h*10-i)/100;
			f=(j%10000-g*100-h*10-i)/1000;
			if(i!=0||h!=0)
			findOut(j,f,g,h,i);
		}

	}

}
