import java.util.*;
public class RunningSum1dArr{

	public static int[]  prefixSum(int[] nums){
		int n=nums.length;

		int[] psArr=new int[n];
		psArr[0]=nums[0];
		for(int i=1; i<n; i++){
			psArr[i]=psArr[i-1]+nums[i];
		}
		return psArr;
	}


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] nums=new int[n];
		System.out.println("Enter Elements in  array");
		for(int i=0; i<n; i++){
			nums[i]=sc.nextInt();
		}

		int [] result=prefixSum(nums);
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
}

	
