public class palindrome{
        static int reverse=0;
	static void palindrome(int num){
		if(num==0){
			return ;
		}
		int digit=num%10;
		reverse=reverse*10+digit;
		palindrome(num/10);
	}


	public static void main(String[] args){
		int num=121;
		palindrome(num);
		if(reverse==num){
			System.out.println(reverse+"given number is palindrome number");
		}else{
			System.out.println("given number is not palindrome");
		}
	}
}
