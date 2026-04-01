class NonRepChar{
	public static void main(String[] args){
		String str="pratiksha";
		char[] arr=str.toCharArray();
		char found='\0';

		for(int i=0; i<arr.length; i++){
			int count=0;
			for(int j=0; j<arr.length; j++){
			if(arr[i]==arr[j]){
				count++;
			}
			}

			if(count==1){
				found=arr[i];
				break;
			}
		}

		if(found!='\0'){
			System.out.println("forst non-repeating character:"+ found);
		}else{
			System.out.println("no non-repeating character found");
	}
}}

