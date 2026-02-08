public class printSubArrayLenk{
	public static void main(String[] args){
		int[] arr={-3,4,-2,5,3,-2,8,2,1,4};
		int k=4;
		int left=0;
		int right=k-1;

		while(right<arr.length){
			for(int i=left; i<=right; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			left++;
			right++;
		}
	}
}


