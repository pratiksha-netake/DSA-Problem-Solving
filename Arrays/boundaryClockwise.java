public class boundaryClockwise{
        public static void main(String[] args){
                int[][] arr=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

                int i=0;
                int j=0;
                int n=arr.length;
                for(int x=0; x<n-1; x++){
                        System.out.print(arr[i][j]+" ");
                        j++;
                }

                for(int x=0; x<n-1; x++){
                        System.out.print(arr[i][j]+" ");
                        i++;
                }

                for(int x=0; x<n-1; x++){
                        System.out.print(arr[i][j]+" ");
                        j--;
                }
                for(int x=0; x<n-1; x++){
                        System.out.print(arr[i][j]+" ");
                        i--;
                }
        }
}

