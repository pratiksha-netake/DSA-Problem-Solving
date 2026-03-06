import java.util.*;
class Solution{
	public boolean findPair(int[] arr,int x){
		Arrays.sort(arr);

		int left=0;
		int right=1;

		while(right<arr.length && left<arr.length){
		       if(left!=right&&arr[right]-arr[left]==x){
		       return true;
		       }
		       else if(arr[right]-arr[left]<x){
		right++;
		       }else{
	       left++;
		       }
		}
 	return false;
    }
       	public static void main(String[] args){
       	Solution obj=new Solution();
	int[] arr={5,20,3,2,5,80};
	int x=78;
	boolean result=obj.findPair(arr,x);
	System.out.println(result);
       }
}
