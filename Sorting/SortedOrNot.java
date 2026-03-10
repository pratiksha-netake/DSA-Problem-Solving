class Solution{

	public static boolean SortedOrNot(int[] arr){

		boolean sorted=true;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				sorted=false;
				break;
			}
		}
		return sorted;
	}

	public static void main(String[] args){
		int [] arr={1,2,3,4,5};
		boolean result=SortedOrNot(arr);
		if(result){
			System.out.println("array is sorted");
		}else{
			System.out.println("array is not sorted");
		}
	}
}
