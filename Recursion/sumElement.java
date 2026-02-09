public class sumElement{

	static int sumElement(int[] arr,int index){
		if(index==arr.length){
			return 0;
		}
		return arr[index]+sumElement(arr,index+1);
	}

	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,4,5};
		System.out.println(sumElement(arr,0));
	}
}
