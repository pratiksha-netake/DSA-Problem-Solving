import java.util.*;
public class BubbleSortSortedArr{
        static void BubbleSort(int[] arr){
                int count=0;
		boolean  swap=false;
                for(int i=0; i<arr.length-1; i++){
                        for(int j=0; j<arr.length-i-1; j++){
                                if(arr[j]>arr[j+1]){
                                        int temp=arr[j];
                                        arr[j]=arr[j+1];
                                        arr[j+1]=temp;		
					swap=true;
                                }
      			}
			 System.out.println(++count);
			if(swap==false){
				break;
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
                BubbleSort(arr);
                System.out.println("sorted array using bubble sort technique");
                for(int i=0; i<n; i++){
                        System.out.print(arr[i]+" ");
                }
        }
}


