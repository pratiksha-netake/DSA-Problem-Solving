public class singleDigitRecursion{
	static int countDigit(int num){
		if(num==0){
			return 0;
		}
		return 1+countDigit(num/10);
	}

	static int findRightIndex(int num,int digit,int rightIndex){
		if(num==0){
			return -1;
		}

		if(num%10==digit){
			return rightIndex;
		}

		return findRightIndex(num/10,digit,rightIndex+1);
	}

	public static void main(String[] args){
		int num=57294;
		int digit=9;
		int totalDigit=countDigit(num);
		int rightIndex=findRightIndex(num,digit,0);
		if(rightIndex==-1){
			System.out.println(-1);
		}else{
			int leftIndex=totalDigit-rightIndex-1;
			System.out.println(leftIndex);
		}
	}
}
