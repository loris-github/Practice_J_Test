
public class TestJava4_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]={{51,38,74,59},{45,17,523,698}};
		print_array(add10(A));
	}
	
	public static int[][] add10(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]+=10;			
			}
		}
		
		return arr;
	}
	
	public static void print_array(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
			
		}
		
	}
}
