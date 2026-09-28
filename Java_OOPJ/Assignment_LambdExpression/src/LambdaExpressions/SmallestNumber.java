package LambdaExpressions;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numArr[] = { 45, 24, 36, 23, 78, 14 };

		Arrays.sort(numArr, (num1, num2) -> Integer.compare(num1, num2));

		System.out.println("Smallest number : " + numArr[0]);

	}

}
