package EmployeeManagement;

import java.io.Serializable;

public class Engineer extends Employee implements Serializable{
	
    private static final long serialVersionUID = 1L;

	
	private double overTime;
	
	public Engineer() {}
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

	public void displayRecord() {
		System.out.println("Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("Age : "+getAge());
		System.out.println("Gender : "+getGender());
		System.out.println("Basic Salery : "+getBasicSalary());
		System.out.println("Over Time : "+getOverTime());


	}
	
	
}
