import java.util.*;
public class SelectionSortSortedArr{
	      static void selectionSort(int[] arr){
                for(int i=0; i<arr.length-1; i++){
                        int minIdx=i;
                        for(int j=i+1; j<arr.length; j++){
                                if(arr[j]<arr[minIdx]){
                                        minIdx=j;
                                }
                        }
			if(minIdx!=i){
                        	int temp=arr[i];
                        	arr[i]=arr[minIdx];
                        	arr[minIdx]=temp;
			}
                }
        }


        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter array length");
                int n=sc.nextInt();
                int[] arr=new int[n];
                System.out.println("enter array element");
                for(int i=0; i<n; i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("unsorted array");
                for(int i=0; i<n; i++){
                        System.out.print(arr[i]+" ");
                }
                System.out.println();
                selectionSort(arr);
                System.out.println("sorted array");
                for(int i=0; i<n; i++){
                        System.out.print(arr[i]+" ");
                }
        }
}

