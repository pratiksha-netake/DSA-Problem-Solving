public class topRight{
        public static void main(String[] args){
                int[][] arr=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

                int rows=arr.length;
                int cols=arr[0].length;

                for(int j=0; j<cols; j++){
                        for(int i=rows-1; i>=0; i--){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                }
        }
}

