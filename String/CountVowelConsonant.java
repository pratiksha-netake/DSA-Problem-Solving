class CountVowelConsonant{
	public static void main(String[] args){
		String str="pratiksha";
		int CountVowel=0;
		int CountConsonant=0;
		for(int i=0; i<str.length(); i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				CountVowel++;
			}else{
				CountConsonant++;
			}
		}
		System.out.println("count of vowel:"+CountVowel);
		System.out.println("count of consonant:"+CountConsonant);
	}
}


