public class maxSubArrSum{

	public static int maxSubArrSum(int[] arr){

		int n= arr.length;
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			sum=sum+arr[i];

			if(sum>maxSum){
				maxSum=sum;
			}
			if(sum<0){
				sum=0;
			}
		}

		return maxSum;
	}
	public static void main(String[] args){
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		int result=maxSubArrSum(nums);
		System.out.println(result);
	}
}
