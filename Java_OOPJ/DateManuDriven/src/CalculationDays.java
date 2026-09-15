
public class CalculationDays {
	

	public static void calculationDay(int days, Date date) {
		
		int currentDate = date.getDate();
		int currentMonth = date.getMonth();
		int currentYear = date.getYear();
		
		int totalDays;
		
		totalDays=days+currentDate;
		
		while(totalDays>date.getMonthArr()[currentMonth]) {
			
			checkLeapYear(currentYear,date.getMonthArr());
			
			totalDays-=date.getMonthArr()[currentMonth];
			
				currentMonth++;
			
			if(currentMonth>12) {
				currentYear++;
			}
		}
		date.setDate(totalDays, currentMonth, currentYear);
	}
	
	private static int checkLeapYear(int currentYear,int marr[]) {
		
		if((currentYear%4==0 && currentYear%100!=0) || (currentYear%400==0)) {
			return marr[2]=29;
		}else {
			return marr[2]=28;
		}
	}

}
