
public class SalesPerson extends Employee{
	
	private double commision;
	
	public SalesPerson(String name, String address, int age, 
			String gender, double basicSalary,double commision) {
		super(name,address,age,gender,basicSalary);
		this.commision = commision;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	

}
