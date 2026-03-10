class Solution{

	public static int smallest(int [] arr,int k){
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
			       if(arr[j]>arr[j+1]){
			       		int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			       }
			}
		}

		for(int i=0; i<arr.length; i++){
			if(i==k-1){
				return arr[i];
			}
		}
		return -1;
	}



	public static void main(String[] args){
		int[] arr={7,10,4,3,20,15};
		int k=3;
		int result=smallest(arr,k);
		System.out.println(k+" Smallest element "+result);
	}
}	
