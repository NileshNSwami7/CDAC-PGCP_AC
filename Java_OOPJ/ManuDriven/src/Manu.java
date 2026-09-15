import Default.ConsolInput;

public class Manu {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int num;
		char ch;
		do {

			System.out.println("Date Manu:");
			System.out.println("1.Add Date");
			System.out.println("3.Add Days:");
			System.out.println("4.Display:");
			System.out.println("5.Exit");
			num = ConsolInput.getInt();
			switch (num) {

			case 1:
				System.out.println("Add date:");
				int dd = ConsolInput.getInt();
				int mm = ConsolInput.getInt();
				int yy = ConsolInput.getInt();
				date.setDate(dd, mm, yy);
				break;
			case 3:
				System.out.println("Add days:");
				int days = ConsolInput.getInt();
				CalculationDays.calculationDay(days, date.getDate(), date.getMonth(), date.getYear());
				break;
			case 4:
				System.out.println(date.getDate() + "/" + date.getMonth() + "/" + date.getYear());
				break;
			case 5:
				System.exit(0);
			default:
				break;
			}
			System.out.print("Do you want to continue...if yes press y if no press n");
			ch = ConsolInput.getChar();
		} while (ch == 'y' || ch != 'n');
		System.out.println("Thank you visit again....");
	}
	
	
}
