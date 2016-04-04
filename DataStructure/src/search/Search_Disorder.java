package search;

public class Search_Disorder {

	public static void main(String[] args) {
		int test[]={1,3,4,6,10,24,35,77};
		System.out.println(Search_Disorder(test,1));
	}

	static int Search_Disorder(int[] A,int key){
		int i;
		for(i=A.length-1;i>=0 && A[i]!=key;--i);
		return i;	
	}
}
