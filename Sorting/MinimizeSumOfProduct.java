import java.util.*;
class Solution {
    public long minValue(List<Integer> arr1, List<Integer> arr2) {
       
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        int n=arr1.size();
        long sum=0;
        for(int i=0; i<n; i++){
            sum+=(long) arr1.get(i)*arr2.get(n-i-1);
        }
        
        return sum;
    }

   public static void main(String[] args){
	  List<Integer> arr1= Arrays.asList(3,1,1);
	 List<Integer> arr2= Arrays.asList(6,5,4);

	Solution obj=new Solution();
       	long result=obj.minValue(arr1,arr2);
	System.out.println("minimum sum"+result);
   }

}
