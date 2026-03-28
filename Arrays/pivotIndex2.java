public class pivotIndex2{

	public static int pivotIdx(int[] nums){
		int n=nums.length;

		int total=0;
		for(int num:nums){
			total+=num;
		}
		int leftSum=0;
		for(int i=0; i<n; i++){
			int rightSum=total-leftSum-nums[i];
			int diff=leftSum-rightSum;

			if(diff==0){
				return i;
			}

			leftSum+=nums[i];
		}

		return -1;
	}
	public static void main(String[] args){
		int[] nums={1,7,3,6,5,6};
		int result=pivotIdx(nums);
		System.out.println(result);
	}
}
