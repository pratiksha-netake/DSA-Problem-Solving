import java.util.*;
class MergeSort{

	public static void SortedArr(int[] arr1,int[] arr2){
		int n=arr1.length;
		int m=arr2.length;
		int[] result=new int[n+m];

		for(int i=0; i<n; i++){
			result[i]=arr1[i];
		}

		for(int i=0; i<m; i++){
			result[n+i]=arr2[i];
		}

		Arrays.sort(result);
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
	public static void main(String[] args){
		int[] arr1={10,5,15};
		int[] arr2={20,3,2};

		SortedArr(arr1,arr2);
	}
}
