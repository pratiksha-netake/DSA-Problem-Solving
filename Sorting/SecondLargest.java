class Solution{

	public static int  SecondLargest(int[] arr){

		for(int i=0; i<arr.length-1; i++){
			int minIdx=i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[minIdx]){
					minIdx=j;
				}
			}
			int temp=arr[minIdx];
			arr[minIdx]=arr[i];
			arr[i]=temp;
		}

		int largest=arr[arr.length-1];
		int secondLargest=-1;

		for(int i=arr.length-2; i>=0; i--){
			if(arr[i]!=largest){
				secondLargest=arr[i];
				break;
			}
		}

		return secondLargest;
	}

	public static void main(String[] args){
		int[] arr={10,5,20,8};
		int result=SecondLargest(arr);
		System.out.println("Second Largest:"+result);
	}
}
