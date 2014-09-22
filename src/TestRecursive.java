
public class TestRecursive {
		
	int splitTime = 3;
	
	public int countPigs(int month){

		if(month<splitTime){
			return 1;
		}
		else	
		return 1 +(month-splitTime)/splitTime+ countPigs(month-splitTime);
		
	}
	
	public int countPigs(int month,int splitTime){
		this.splitTime = splitTime;
		return this.countPigs(month);
	}
	
	
	public static void main(String[] args) {
		TestRecursive tr = new TestRecursive();
		System.out.print(tr.countPigs(20,5));
	}

}
