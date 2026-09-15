import Default.ConsolInput;

public class CompleNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ComplexNumber complexArr[] = new ComplexNumber[5];
		
		for(int i=0;i<complexArr.length;i++) {
			complexArr[i]=new ComplexNumber();
			System.out.println("Enter first Number1:");
			int number1 = ConsolInput.getInt();
			complexArr[i].setNumber1(number1);
			System.out.println("Enter first Number1:");
			int number2 = ConsolInput.getInt();
			complexArr[i].setNumber2(number2);
		}
		
		for(int i=0;i<complexArr.length;i++) {
			System.out.println("Result: "+i+": "+complexArr[i].getNumber1() +"*"+complexArr[i].getNumber2()+"="+complexArr[i].computeComplexNumber());
		}
	}

}
