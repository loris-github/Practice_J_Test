public class TestMain {


	public static void main(String[] args) {
		int j =args.length;
		if(j!=2){
			System.out.println("输入的参数个数有错误");
			System.exit(1);
		}
		
		for(int i=0;i<j;i++){
			System.out.println(args[i]);
		}
		
	}

}
