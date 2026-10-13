import java.util.Scanner;

public class MenuDrivenBonus {
	
	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static char g;
	static boolean h;

	private static void valuesOfVariable() {
		System.out.println("byte a : " +a);
		System.out.println("short b : " +b);
		System.out.println("int c : " +c);
		System.out.println("long d : " +d);
		System.out.println("float e : " +e);
		System.out.println("double f : " +f);
		System.out.println("byte g : " +g);
		System.out.println("byte h : " +h);
	}

	private static void dayOfWeek() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number:");
		int day = sc.nextInt();
		
		switch(day){
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunaday");
				break;
			default:
					System.out.println("Invalid input.");
		}

	}

	private static void leapYearCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not leap year");
		}
	}

	private static void gardeEvolutionSystem() {
		int marksMaths = 80;
		int marksScience = 85;
		int marksHistory = 90;

		int totalMarks = (marksMaths + marksScience + marksHistory) / 3;

		if (totalMarks >= 95) {
			System.out.println("Grade A");
		} else if (totalMarks >= 70 && totalMarks <= 89) {
			System.out.println("Grade B");
		} else if (totalMarks > 70 && totalMarks < 89) {
			System.out.println("Grade C");
		} else if (totalMarks > 50 && totalMarks < 69) {
			System.out.println("Grade D");
		} else if (totalMarks < 30) {
			System.out.println("GRADE Fail");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MenuDrivenBonus mdb = new MenuDrivenBonus();
		int num;
		char ch;
		do {
			System.out.println("Press 1: Grade Evaluation System");
			System.out.println("Press 2: Leap Year Check");
			System.out.println("Press 3: Day of the week");
			System.out.println("Press 4: Identify Default Values of Variables");
			System.out.println("Press 5: Exit.");

			num = sc.nextInt();

			switch (num) {
			case 1:
				gardeEvolutionSystem();
				break;
			case 2:
				leapYearCheck();
				break;
			case 3:
				dayOfWeek();
				break;
			case 4:
				valuesOfVariable();
				break;
			case 5:
				System.exit(0);

			default:
				System.out.println("Invalid Input");

			}
			
			System.out.println("**********************");
			
		} while (num<=5);

	}

}
