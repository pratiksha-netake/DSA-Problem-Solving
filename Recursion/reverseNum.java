public class reverseNum{
        static int reverse=0;
	static void reverseNum(int num){
		if(num==0){
			return ;
		}
		int digit=num%10;
		reverse=reverse*10+digit;
		reverseNum(num/10);
	}

	public static void main(String[] args){
		int num=123;
		reverseNum(num);
		System.out.println(reverse);
	}
}
