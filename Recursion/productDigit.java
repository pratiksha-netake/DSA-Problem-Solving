public class productDigit{
	static int productDigit(int n){
		if(n==0){
			return 1;
		}

		return n%10*productDigit(n/10);
	}
	public static void main(String[] args){
		int num=1234;
		System.out.println(productDigit(num));
	}
}

