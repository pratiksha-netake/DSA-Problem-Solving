public class prefixSum{
	public static void main(String[] args){
		int arr[]={-3,6,2,4,5,2,8,-9};
		int n=arr.length;
		System.out.println("normal array");
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+" ");
		}
		int[] psArr=new int[n];
		psArr[0]=arr[0];
		for(int i=1; i<n; i++){
			psArr[i]=psArr[i-1]+arr[i];
		}
		System.out.println("prefix sum array");
		for(int i=0; i<psArr.length; i++){
			System.out.println(psArr[i]+" ");
		}
	}
}
