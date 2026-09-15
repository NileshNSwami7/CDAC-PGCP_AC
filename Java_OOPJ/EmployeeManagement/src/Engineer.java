
public class Engineer extends Employee{
	
	private double overTime;
	
	public Engineer(String name, String address, int age, String gender, double basicSalary,double overTime) {
		super(name,address,age,gender,basicSalary);
		this.overTime = overTime;
	}

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}
	
	
}
