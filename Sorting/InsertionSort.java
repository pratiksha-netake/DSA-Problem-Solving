import java.util.*;
public class InsertionSort{
        static void InsertionSort(int[] arr){
                for(int i=1; i<arr.length; i++){
			int key=arr[i];
                        int j=i-1;
			while(j>=0 && arr[j]>key){
                                arr[j+1]=arr[j];
                                j--;
                        }
			arr[j+1]=key;
                        
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
                InsertionSort(arr);
                System.out.println("sorted array using Insertion  sort technique");
                for(int i=0; i<n; i++){
                        System.out.print(arr[i]+" ");
                }
        }
}


