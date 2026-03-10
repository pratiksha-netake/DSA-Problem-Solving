class CountOccurrence{
	
	public static int FirstOcc(int[] arr,int target){
		int left=0;
		int right=arr.length-1;
		int result=-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==target){
				result=mid;
				right=mid-1;
			}else if(arr[mid]<target){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		return result;
	}

	public static int LastOcc(int[] arr,int target){
		int left=0; 
		int right=arr.length-1;
		int result=-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==target){
				result=mid;
				left=mid+1;
			}else if(arr[mid]<target){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		return result;
	}

	public static int CountOcc(int[] arr,int target){
		int first=FirstOcc(arr,target);
		if(first==-1) return 0;
		int last=LastOcc(arr,target);
		return last-first+1;
	}

	public static void main(String[] args){
		int[] arr={1,2,2,2,3,4};
		int target=2;
		System.out.println(" Count of "+target+" is : "+CountOcc(arr,target));
	}
}
