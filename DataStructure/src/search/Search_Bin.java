package search;

public class Search_Bin {

	public static void main(String[] args) {
		int test[]={1,3,4,6,10,24,35,77};
		System.out.println(Search_Bin(test,78));
	}
	
	static int Search_Bin(int[] A,int key){
		int mid;
		int low=0;
		int high=A.length-1;
		while(low <= high){			
			mid=(low+high)/2;
			if(A[mid] == key){
				return mid;
			}
			else if(A[mid] < key){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	}
}
