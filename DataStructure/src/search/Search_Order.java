package search;

public class Search_Order {

	public static void main(String[] args) {
		int test[]={1,3,4,6,10,24,35,77};
		System.out.println(Search_Order(test,24));
	}

	static int Search_Order(int[] A,int key){
		int i;
		for(i=A.length-1;i>=0 && A[i]>key;--i);
		if(i<0 || A[i]<key)
			return -1;
		return i;	
	}
}
