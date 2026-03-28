import java.util.*;
public class leftRightSumDiff{
	public static int[] findDiff(int[] nums){
		int n=nums.length;
		int[] result=new int[n];
		int total=0;
		for(int num:nums){
			total+=num;
		}

		int leftSum=0;

		for(int i=0; i<n; i++){
			int rightSum=total-leftSum-nums[i];
			result[i]=Math.abs(leftSum-rightSum);
			leftSum+=nums[i];
		}

		return result;
	}




		public static void main(String[] args){
			int[] nums={10,4,8,3};
			int[] res=findDiff(nums);
			System.out.println(Arrays.toString(res));
		}
}
