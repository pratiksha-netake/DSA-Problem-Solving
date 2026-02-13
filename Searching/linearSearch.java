import java.util.*;
public  class linearSearch{

	static int linearSearch(int[] arr,int k){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==k){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arry length");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array element");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("enter element to search");
		int k=sc.nextInt();

		int result=linearSearch(arr,k);
		if(result==-1){
			System.out.println("element not found");
		}else{
			System.out.println("element found"+result);
		}

	}
}

