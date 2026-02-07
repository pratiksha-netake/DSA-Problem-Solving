public class columnSum{
	public static void main(String[] args){
		int[][] arr=new int[][]{{1,2,3},{4,5},{6,7,2,1}};

		for(int i=0; i<arr[0].length; i++){
			int sum=0;
			for(int j=0; j<arr.length; j++){
				if(i<arr[j].length){
					sum=sum+arr[j][i];
				}
			}
			System.out.println("sum of column"+i+"="+sum);
		}
	}
}


