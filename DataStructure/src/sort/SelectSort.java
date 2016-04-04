package sort;

public class SelectSort {

	public static void main(String[] args) {
		int test[]={1,3,4,611,100,4,35,77};
		SelectSort(test,test.length);
		for(int var:test){
			System.out.print(var+",");
		}
	}

	static void SelectSort(int[] A,int len){
		int min;
		for(int i=0;i<len;++i){
			min=i;
			for(int j=i+1;j<len;++j){
				if(A[j]<A[min])
					min=j;
			}
			if(min!=i)
				swap(A, min, i);				
		}	
	}
	
	static void swap(int[] A,int index1,int index2){
		int temp=A[index1];
		A[index1]=A[index2];
		A[index2]=temp;
	}
}
