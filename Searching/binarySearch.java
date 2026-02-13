import java.util.*;
public class binarySearch{

	static int binarySearch(int[] arr,int ele){
		int startIdx=0;
		int endIdx=arr.length-1;
		while(startIdx<=endIdx){
			int mid=startIdx+endIdx/2;

			if(arr[mid]==ele){
				return mid;
			}
			if(arr[mid]<ele){
				startIdx=mid+1;
			}else{
				endIdx=mid-1;
			}
		}
		return -1;
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

		System.out.println("enter element to search");
		int k=sc.nextInt();
		int result=binarySearch(arr,k);
		if(result==-1){
			System.out.println("element not found");
		}else{
			System.out.println(result+"elemnt found at index");
		}
	}
}



