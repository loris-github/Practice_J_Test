class SuperK{
	void KK_print(){
		System.out.println("SuperK work!");
	}
}

class K extends SuperK{
	void KK_print(){
		System.out.println("K work!");
	}
}

public class MyUpcasting {
	
	static void whichWay (SuperK i){
		i.KK_print();
	}
	
	public static void main(String[] args){
	
		K k = new K();
		whichWay(k);
		
	}
}
