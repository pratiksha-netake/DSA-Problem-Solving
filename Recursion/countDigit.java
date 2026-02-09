public class countDigit{
	static int countDigit(int num){
		if(num==0){
			return 0;
		}

		return 1+countDigit(num/10);
	}

		

	public static void main(String[] args){
		int num=1123;
		int count=countDigit(num);
		System.out.println(count);
	}
}
