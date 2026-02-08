public class leftDiagonal{
        public static void main(String[] args){
                int[][] arr=new int[][]{{1,0,2},{1,2,1},{3,4,5}};

                for(int i=0; i<arr.length; i++){
                        for(int j=i; j<=i; j++){
                                System.out.print(arr[i][j]);
                        }
                        System.out.println();
                }
        }
}

