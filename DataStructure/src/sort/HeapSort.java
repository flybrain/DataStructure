package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort {

	public static void main(String[] args) {
		List<Integer> testList=new ArrayList();
		Integer test[]={1,30,4,61,100,4,35,77};
//		testList=Arrays.asList(test);//会定死testList，不能add
		testList.addAll(Arrays.asList(test));
//		HeapSort(testList,testList.size());
		AddHeapSort(testList,120,testList.size());
		
		for(int var:testList){
			System.out.print(var+",");
		}
	}
	
	static void AddHeapSort(List<Integer> A, int value, int len){
		BuildMaxHeap(A, len);
		A.add(value);
		AdjustUp(A, A.size()-1);
		for(int i=A.size()-1;i>=0;--i){
			swap(A, i, 0);
			AdjustDown(A, 0, i);
		}		
	}

	static void AdjustDown(List<Integer> A, int k, int len){
		int i=k*2+1;
		int temp=A.get(k);
		while(i<len){
			if(i!=len-1 && A.get(i) < A.get(i+1))//i=len-1, 没有A.get(i+1)
				++i;
			if(A.get(i) <= temp)
				break;
			A.set(k, A.get(i));
			k=i;
			i=i*2+1;
		}
		A.set(k, temp);
	}
	
	static void AdjustUp(List<Integer> A, int k){
		int i=(k-1)/2;//k>=1
		int temp=A.get(k);
		while(i >= 0){		
			if(A.get(i) >= temp)
				break;
			A.set(k, A.get(i));
			k=i;
			if(i==0)
				break;
			i=(i-1)/2;
		}
		A.set(k, temp);
	}
	
	static void BuildMaxHeap(List<Integer> A, int len){
		for(int i=(len-1)/2;i>=0;--i)
			AdjustDown(A, i, len);
	}
	
	static void HeapSort(List<Integer> A, int len){
		BuildMaxHeap(A, len);
		for(int i=len-1;i>=0;--i){
			swap(A, i, 0);
			AdjustDown(A, 0, i);
		}
	}
	
	static void swap(List<Integer> A,int index1,int index2){
		int temp=A.get(index1);
		A.set(index1,A.get(index2));
		A.set(index2,temp);
	}
}
