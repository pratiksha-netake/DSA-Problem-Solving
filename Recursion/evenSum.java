public class evenSum{
	static int evenSum(int n){
		if(n<=0){
			return 0;
		}
		if(n%2==0){
			return n+ evenSum(n-1);
		}else{
			return evenSum(n-1);
		}
	}
	public static void main(String[] args){
		int n=10;
		int sum=evenSum(n);
		System.out.println(sum);
	}
}
