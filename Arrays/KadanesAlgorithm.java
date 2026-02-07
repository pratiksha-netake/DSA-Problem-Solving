public class KadanesAlgorithm{
	public static void main(String[] args){
		int[] arr=new int[]{2,3,6,8,2,9};

		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			sum=sum+arr[i];
			if(maxSum<sum){
				maxSum=sum;
			}
			if(sum<0){
				sum=0;
			}
		}
		System.out.println(maxSum);
	}
}
