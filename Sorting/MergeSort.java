import java.util.*;
public class MergeSort{

	static void merge(int[] arr,int start,int mid,int end){
		int n1=mid-start+1;
		int n2=end-mid;

		int leftArr[]=new int[n1];
		int rightArr[]=new int[n2];

		for(int i=0; i<n1; i++){
			leftArr[i]=arr[start+i];
		}

		for(int i=0; i<n2; i++){
			rightArr[i]=arr[mid+1+i];
		}

		int i=0;
		int j=0;
		int k=start;

		while(i<n1 && j<n2){
			if(leftArr[i]<rightArr[j]){
				arr[k]=leftArr[i];
				i++;
			}else{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}

		while(i<n1){
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	static void mergeSort(int[] arr,int start,int end){
		if(start>=end){
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array element");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		 for(int i=0; i<n; i++){
			 System.out.print(arr[i]+" ");
		 }
		 int start=0;
		 int end=n-1;
		 mergeSort(arr, start,end);
		 System.out.println("sorted array using merge sort");
		 for(int i=0; i<n; i++){
			 System.out.print(arr[i]+" ");
		 }
	}
}
		
