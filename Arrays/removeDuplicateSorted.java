import java.util.*;
class removeDuplicate{
	public static void main(String[] args){
	int[] arr={1,1,2,2,3};
	Set<Integer> set=new LinkedHashSet<Integer>();
	for(int num:arr){
		set.add(num);
	}
	System.out.println(set);
	}
}

