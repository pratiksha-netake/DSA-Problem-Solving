class checkPalindrome{
	public static void main(String[] args){
		String str="madam";
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String str2=sb.toString();
		if(str.equals(str2)){
			System.out.println("Palindrome");
		}else{
			System.out.println("not a palindrome");
		}
	}
}
