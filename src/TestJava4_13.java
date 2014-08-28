
public class TestJava4_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]={{3,4,5},{4,5,7}};
		print_mat(A);
	}
	
	public static void print_mat(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}				
				System.out.print("\n");
			
		}
	}
}
