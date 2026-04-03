import java.util.*;
class RemoveDuplicateChar{
	public static void main(String[] args){
		String str="pratiksha";
		HashSet<Character> set=new HashSet<Character>();
		String result=" ";
		for(int i=0; i<str.length(); i++){
			char ch=str.charAt(i);

			if(!set.contains(ch)){
				set.add(ch);
				result+=ch;
			}

		}
		System.out.println(result);
	}
}
	

