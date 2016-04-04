package sort;

public class InsertSort_Bin {

	public static void main(String[] args) {
		int test[]={1,30,49,61,10,4,35,77};
		InsertSort_Bin(test,test.length);
		for(int var:test){
			System.out.print(var+",");
		}
	}

	static void InsertSort_Bin(int[] A,int len){
		int temp;
		int j;
		int low;
		int high;
		int mid;
		for(int i=1;i<len;++i){
			low=0;
			high=i-1;
			temp=A[i];
			while(low<=high){
				mid=(low+high)/2;
				if(A[mid]>temp)
					high=mid-1;
				else {
					low=mid+1;
				}			
			}
			for(j=i-1;j>=high+1;--j)
				A[j+1]=A[j];
			A[high+1]=temp;			
		}
	}
}
