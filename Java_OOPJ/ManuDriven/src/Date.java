
public class Date {

	private int date=1;
	private int month=1;
	private int year=2002;

	Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}

	Date() {

	}

	public void setDate(int date, int month, int year) {
		this.year = year;
		this.month = month;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 31) {
			if (date < 1 && date > 31) {
				this.date = 1;
			} else {
				this.date = date;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (date < 1 && date > 30) {
				this.date = 1;
			} else {
				this.date = date;
			}
		} else {
			if (month == 2) {
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					if (date < 1 && date > 29) {
						this.date = 1;
					} else {
						this.date = date;
					}
				}
			}
		}
	}

	public int getDate() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}
