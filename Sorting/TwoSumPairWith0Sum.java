import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        
        Arrays.sort(arr);
    
      
       ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==0){
                ArrayList<Integer> pair=new ArrayList<Integer>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                
                int l=arr[left];
                int r=arr[right];
                
                while(left<right&&arr[left]==l) {
                    left++;
                }
                while(left<right&&arr[right]==r){
                    right--;
                }
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
        return result;
        
        
    }
    
    public static void main(String[] args){
        int [] arr={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> ans = getPairs(arr);
        
        for(ArrayList<Integer> pair:ans){
            System.out.println(pair);
        }
        
    }
}

