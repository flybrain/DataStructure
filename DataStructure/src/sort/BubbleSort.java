package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int test[]={1,30,4,61,10,4,35,77};
		BubbleSort(test,test.length);
		for(int var:test){
			System.out.print(var+",");
		}
	}

	static void BubbleSort(int[] A,int len){
		boolean flag;
		for(int i=0;i<len;++i){
			flag=false;
			for(int j=len-1;j>i;--j){
				if(A[j]<A[j-1]){
					swap(A, j, j-1);
					flag=true;
				}
			}
			if(!flag)
				return;
		}
	}

	static void swap(int[] A,int index1,int index2){
		int temp=A[index1];
		A[index1]=A[index2];
		A[index2]=temp;
	}
}
