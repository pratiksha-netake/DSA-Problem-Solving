public class maxSumlenKPrefixSum{
	public static void main(String[] args){
		int [] arr={-3,4,-2,5,3,-2,8,2,1,4};
		int[] psArray=new int[arr.length];

		psArray[0]=arr[0];
		for(int i=1; i<arr.length; i++){
			psArray[i]=psArray[i-1]+arr[i];
		}
		
		int k=4;

		int start=0;
		int end=k-1;
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		while(end<arr.length){
			if(start==0){
				sum=psArray[end];
			}else{
				sum=psArray[end]-psArray[start-1];
			}

			if(maxSum<sum){
				maxSum=sum;
			}
			start++;
			end++;
		}
		System.out.println(maxSum);


	}
}
