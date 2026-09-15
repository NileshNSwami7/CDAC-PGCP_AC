package Default;

public class Programm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number:");

		int num1 = ConsolInput.getInt();

		System.out.println("Enter Number:");

		int num2 = ConsolInput.getInt();
		
		Calaculator calculator = new Calaculator();
		
		int result = calculator.add(num1,num2);
		
		System.out.println("Result :"+result);

	}

}
