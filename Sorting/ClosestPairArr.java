import java.util.*;
class Solution {
    public List<Integer> closestPairSum(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        
        int minDiff=Integer.MAX_VALUE;
        
        List<Integer> result=new ArrayList<Integer>();
        
        if(arr==null||arr.length<2){
            return result;
        }
        
        int a=0;
        int b=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            int diff=Math.abs(target-sum);
            
            if(diff<minDiff){
                minDiff=diff;
                a=arr[left];
                b=arr[right];
            }
            
            if(sum>target){
                right--;
                
            }else{
                left++;
            }
           
        }
        
         
         
            result.add(a);
            result.add(b);
            return result;
    }

    public static void main(String[] args){
	    Solution obj=new Solution();
	    int[] arr={40,10,29,28,22,1,30};
	    int target=54;

	    List<Integer> ans=obj.closestPairSum(arr,target);
	    if(ans.size()==0){
		    System.out.println("[]");
	    }else{
		    System.out.println(ans);
	    }
    }
}

