public class sumEvenDigit{

	static int sumEvenDigit(int num){
		if(num==0){
			return 0;
		}

		int digit=num%10;
		if(digit%2==0){
			return digit+sumEvenDigit(num/10);
		}else{
			return sumEvenDigit(num/10);
		}
	}
	public static void main(String[] args){
		int num=123456;
		System.out.println(sumEvenDigit(num));
	}
}
