
public class Manager extends Employee{
	
	private double hra;
	
	Manager(String name, String address, int age, String gender, double basicSalary,double hra){
		super(name,address,age,gender,basicSalary);
		this.hra = hra;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	
}
