package sort;

public class ShellSort {

	public static void main(String[] args) {
		int test[]={1,3,4,61,10,4,35,77};
		ShellSort(test,test.length);
		for(int var:test){
			System.out.print(var+",");
		}
	}

	static void ShellSort(int[] A,int len){
		int i;
		int j;
		int temp;
		for(int d=len/2;d>=1;d/=2){
			for(i=d;i<len;++i){
				if(A[i-d] > A[i]){
					temp=A[i];
					for(j=i-d;j>=0 && A[j]>temp;j-=d)
						A[j+d]=A[j];
					A[j+d]=temp;
				}
			}
		}
	}
}
