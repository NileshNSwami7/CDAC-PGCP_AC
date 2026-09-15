
public class CalculationDays {
	
	public static void calculationDay(int days, int d, int m, int y) {
		int count = 1;
		int sum = 1;
		int cday = 1;
		int temp=0;
		while (count <= days) {
			sum = cday + d;
			temp=sum;
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (temp < 1 || temp > 31) {
					d = 1;
					sum = 0;
					cday=0;
					m++;
				}

			} else if (m == 4 || m == 6 || m == 9 || m == 11) {
				if (temp < 1 || temp > 30) {
					d = 1;
					sum = 0;
					cday=0;
					m++;
				}

			} else {
				if((y%4==0 && y%100!=0) || (y % 400==0)) {
					if (temp < 1 || temp > 29) {
						d = 1;
						sum = 0;
						cday=0;
						m++;
					}
				}else {
					if (temp < 1 || temp > 28) {
						d = 1;
						sum = 0;
						cday=0;
						m++;
					}
				}
				
			}
			if (m >= 12) {
				y++;
			}
			sum=0;
			cday++;
			count++;
		}
		
		System.out.println("Added days : "+ temp +"/"+m+"/"+y );
	}

}
