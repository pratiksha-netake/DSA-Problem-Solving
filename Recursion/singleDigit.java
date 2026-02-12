public class singleDigit{
	public static void main(String[] args){
		int num=57294;
		int digit=9;

		int temp=num;
		int totalDigit=0;

		while(temp>0){
			totalDigit++;
			temp=temp/10;
		}

		temp=num;
		int rightIndex=0;
		int found=-1;
		while(temp>0){
			if(temp%10==digit){
				found=totalDigit-rightIndex-1;
				break;
			}
			temp=temp/10;
			rightIndex++;
		}
		System.out.println(found);
	}
}
