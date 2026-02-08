public class transpose{
        public static void main(String[] args){
                int[][] arr=new int[][]{{1,4,7},{2,5,8},{3,6,9}};

                for(int i=0; i<arr.length; i++){
                        for(int j=i+1; j<arr.length; j++){
                                int temp=arr[i][j];
                                arr[i][j]=arr[j][i];
                                arr[j][i]=temp;
                        }
                }
                for(int i=0; i<arr.length; i++){
                        for(int j=0; j<arr.length; j++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();

                }
        }
}

