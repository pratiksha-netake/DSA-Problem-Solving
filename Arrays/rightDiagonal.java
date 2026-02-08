public class rightDiagonal{
        public static void main(String[] args){
                int[][] arr=new int[][]{{1,0,2},{1,2,1},{3,4,5}};
                int i=0;
                int j=arr.length-1;
                while(i<arr.length&&j>=0){
                        System.out.println(arr[i][j]);
                        i++;
                        j--;
                }

        }
}

