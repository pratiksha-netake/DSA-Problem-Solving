class Solution {
    public int findFloor(int[] arr, int x) {
        int floorNo=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=x){
                floorNo=i;
            }
        }
        return floorNo;
        
    }

    public static void main(String[] args){
	    Solution obj=new Solution();
	    int[] arr={1,2,4,6,10,12};
	    int x=5;

	    int result=obj.findFloor(arr,x);
	    System.out.println("floor index:"+result);
	    if(result!=-1){
		    System.out.println("floor value:"+arr[result]);
	    }else{
		    System.out.println("no floor found");
	    }
    }
}

