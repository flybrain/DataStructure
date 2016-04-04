package sort;

public class InsertSort {

	public static void main(String[] args) {
		int test[]={1,30,4,61,10,4,35,77};
		InsertSort(test,test.length);
		for(int var:test){
			System.out.print(var+",");
		}
	}

	static void InsertSort(int[] A,int len){
		int temp;
		int j;
		for(int i=1;i<len;++i){
			if(A[i-1] > A[i]){
				temp=A[i];
				for(j=i-1;j>=0 && A[j]>temp;--j)
					A[j+1]=A[j];
				A[j+1]=temp;
			}
		}
	}
}
