
public class Date {

	private int date;
	private int month;
	private int year;
	private int monthArr[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};

	Date(int date, int month, int year) {
		this.date=date;
		this.month=month;
		this.year=year;
	}

	Date() {

	}

	public void setDate(int date, int month, int year) {
		this.date=date;
		this.month=month;
		this.year=year;
	}

	public int getDate() {
		return this.date;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public int[] getMonthArr() {
		return this.monthArr;
	}
}
