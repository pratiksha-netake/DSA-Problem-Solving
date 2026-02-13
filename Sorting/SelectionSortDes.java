import java.util.*;
public class SelectionSortDes{
	static void SelectionSort(int[] arr){
                for(int i=0; i<arr.length-1; i++){
                        int maxIdx=i;
                        for(int j=i+1; j<arr.length; j++){
                                if(arr[j]>arr[maxIdx]){
                                        maxIdx=j;
                                }
                        }
                        int temp=arr[i];
                        arr[i]=arr[maxIdx];
                        arr[maxIdx]=temp;
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
                SelectionSort(arr);
                System.out.println("sorted array with desending order");
                for(int i=0; i<n; i++){
                        System.out.print(arr[i]+" ");
                }
        }
}

