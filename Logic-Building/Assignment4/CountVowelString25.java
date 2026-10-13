import java.util.Scanner;

public class CountVowelString25{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = sc.next().toLowerCase();
		int count=0;
		for(int i=0 ;i<str.length();i++){
			char ch=str.charAt(i);
			if( ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
		}
		System.out.println("The number of vowel in "+str+" is " +count);
	}
}