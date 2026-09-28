package LambdaExpressions;

import java.util.Arrays;

public class StringArrayWithLambda {

	public static void main(String[] args) {
		
		String strArr[] = {"Blue","White","Red","Orange","Green","Purple"};
		
		Arrays.sort(strArr,(c1,c2)->c1.compareTo(c2));
		System.out.println("Asceding order : "+Arrays.toString(strArr));
		Arrays.sort(strArr,(c1,c2)->c2.compareTo(c1));
		System.out.println("Descceding order : "+Arrays.toString(strArr));
	}

}
