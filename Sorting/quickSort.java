class QuickSort{

	static int partition(int[] arr,int start,int end){
		int pivot=arr[end];
		int pivotIndex=start-1;
		for(int j=start; j<end; j++){
			if(arr[j]<pivot){
				pivotIndex++;
				int temp=arr[j];
				arr[j]=arr[pivotIndex];
				arr[pivotIndex]=temp;
			}
		}
		pivotIndex++;

		int temp=arr[end];
		arr[end]=arr[pivotIndex];
		arr[pivotIndex]=temp;
		return pivotIndex;
	}

	static void quickSort(int[] arr,int start,int end){
		if(start>=end)
			return;

		int pivotIndex=partition(arr,start,end);

		quickSort(arr,start,pivotIndex-1);
		quickSort(arr,pivotIndex+1,end);
	}

	public static void main(String[] args){
		int[] arr={10,7,8,9,1,5};

		System.out.println("original array");
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();

		quickSort(arr,0,arr.length-1);

		System.out.println("sorted array");
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
}




