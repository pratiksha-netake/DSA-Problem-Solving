class StringMethod{
	public static void main(String[] args){

		String str=" Hello Java World ";
		String str2="hello java world";

		System.out.println("length:"+str.length());
		System.out.println("Character at index 2:"+str.charAt(2));
		System.out.println("lowercase:"+str.toLowerCase());
		System.out.println("uppercase:"+str.toUpperCase());
		System.out.println("trimmed:"+str.trim());

		System.out.println("equals:"+str.equals(str2));
		System.out.println("equal ignore case:"+str.equalsIgnoreCase(str2));
		System.out.println("compare to :"+str.compareTo(str2));

		System.out.println("contains java:"+str.contains("java"));
		System.out.println("index of 'java':"+str.indexOf("java"));
		System.out.println("LastIndex of 'o':"+str.lastIndexOf("o"));
		System.out.println("starts with 'he':"+str.startsWith("ld "));
		System.out.println("ends with:"+str.endsWith("ld "));

		System.out.println("substring:"+str.substring(2));
		System.out.println("substring(2,7):"+str.substring(2,7));


		System.out.println("replace java with python:"+str.replace("java","python"));
		System.out.println("concanted:"+str.concat("! ! !"));
	
	}
}
