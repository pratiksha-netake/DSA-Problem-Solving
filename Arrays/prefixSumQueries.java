import java.util.*;
public class prefixSumQueries{
	public static void main(String[] args){
	int[] arr={10,20,10,5,15};
	int n=arr.length;
	int Q=3;
	int psArr[]=new int[n];
	psArr[0]=arr[0];
	for(int i=1; i<n; i++){
		psArr[i]=psArr[i-1]+arr[i];
	}

	Scanner sc=new Scanner(System.in);
	int sum=0;
	for(int i=0; i<Q; i++){
		System.out.println("enter start index");
		int startIdx=sc.nextInt();
		System.out.println("enter end index");
		int endIdx=sc.nextInt();

		if(startIdx==0){
			sum=psArr[endIdx];
		}else{
			sum=psArr[endIdx]-psArr[startIdx-1];
		}
		System.out.println("sum"+sum);
	}
}}

