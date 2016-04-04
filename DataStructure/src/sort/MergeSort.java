package sort;

public class MergeSort {

	public static void main(String[] args) {
		int test[]={1,3,4,61,100,4,35,77};
		MergeSort(test,0,test.length-1);
		for(int var:test){
			System.out.print(var+",");
		}
	}

	static void MergeSort(int[] A,int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			MergeSort(A, left, mid);
			MergeSort(A, mid+1, right);
			Merge(A, left, mid,right);
		}
	}
	
	static void Merge(int[] A,int left,int mid, int right){
//		int B[]=new int[right-left+1];//B[k]可能越界
		int B[]=new int[A.length];
		for(int k=left;k<=right;++k)
			B[k]=A[k];
		int i,j,k;
		for(i=left,j=mid+1,k=i;i<=mid && j<=right;++k){
			if(B[i]<B[j])
				A[k]=B[i++];
			else {
				A[k]=B[j++];
			}
		}
		while(i<=mid)
			A[k++]=B[i++];
		while(j<=right)
			A[k++]=B[j++];
	}
}
