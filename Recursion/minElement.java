public class minElement{
	static int minElement(int[] arr,int index){
		if(index==arr.length-1){
			return arr[index];
		}
		int min=minElement(arr,index+1);

			if(arr[index]<min){
				return arr[index];
			}
			else{
				return min;
			}
	}
		
	public static void main(String[] args){
		int[] arr=new int[]{7,2,5,1,9,3};
		System.out.println(minElement(arr,0));
	}
}
