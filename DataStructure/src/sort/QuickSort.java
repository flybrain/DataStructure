package sort;

public class QuickSort {

	public static void main(String[] args) {
		int test[]={1,3,4,61,100,4,35,77};
		QuickSort(test,0,test.length-1);
		for(int var:test){
			System.out.print(var+",");
		}
	}

	static void QuickSort(int[] A,int low,int high){
		if(low<high){
			int key=Partition(A, low, high);
			QuickSort(A, low, key-1);
			QuickSort(A, key+1, high);
		}
	}
	
	static int Partition(int[] A,int low,int high){
		int key=A[low];
		while(low<high){
			while(low<high && A[high] >= key)
				--high;
			A[low]=A[high];
			while(low<high && A[low] <= key)
				++low;
			A[high]=A[low];
		}
		A[low]=key;
		return low;
	}
}
