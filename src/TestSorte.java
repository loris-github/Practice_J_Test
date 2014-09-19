class DataSorter {
	
	
	public static int[] sort(int[] intArray){
		
		
		return intArray;
	}
	
	public static void p(int[] intArray){
		
		for(int i =0;i<intArray.length;i++){
			System.out.print("a["+i+"]:"+intArray[i]+" ,");
		}
		
	}
}




public class TestSorte {

	public static void main(String[] args) {
		int a[] = {9,5,3,7,1};
		DataSorter.sort(a);
		DataSorter.p(a);
	}

}
