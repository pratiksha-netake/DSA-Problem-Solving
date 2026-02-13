import java.util.*;
public class binaryRecursion{

	static int binaryRecursion(int[] arr,int element,int startIndex,int endIndex){
		if(startIndex>endIndex){
			return -1;
		}

		int mid=(startIndex+endIndex)/2;
		if(arr[mid]==element){
			return mid;
		}
		if(arr[mid]<element){
			return binaryRecursion (arr,element,mid+1,endIndex);
		}else{
			return binaryRecursion(arr,element,startIndex,mid-1);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter element in array");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to search");
		int element=sc.nextInt();
		int startIndex=0;
		int endIndex=n-1;
		int result=binaryRecursion(arr,element,startIndex,endIndex);
		if(result==-1){
			System.out.println("element not found");
		}else{
			System.out.println("element found at index"+result);
		}
	}
}


