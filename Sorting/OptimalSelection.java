import java.util.*;
class Solution {

    public static int Select(int arr[]) {
        Arrays.sort(arr);
        long mod=1000000007;
        
        long sum=0;
        for(int i=0; i<arr.length; i++){
            sum=(sum+((long)arr[i]*i)%mod)%mod;
           
        }
        
        return (int)sum;
    }

    public static void main(String[] args){
	    int[] arr=new int[]{1,2,2,4,9};
        int result=Select(arr);
	System.out.println(result);
    }
}
