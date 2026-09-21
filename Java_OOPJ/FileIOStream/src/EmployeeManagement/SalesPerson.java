package EmployeeManagement;

import java.io.Serializable;

public class SalesPerson extends Employee implements Serializable{
	
    private static final long serialVersionUID = 1L;

	private double commision;
	
	public SalesPerson() {}
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

	public void displayRecord() {
		System.out.println("Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("Age : "+getAge());
		System.out.println("Gender : "+getGender());
		System.out.println("Basic Salery : "+getBasicSalary());
		System.out.println("Sales Person : "+getBasicSalary());


	}
	
	

}
