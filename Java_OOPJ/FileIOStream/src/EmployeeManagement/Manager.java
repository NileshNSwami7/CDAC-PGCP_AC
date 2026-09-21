package EmployeeManagement;

import java.io.Serializable;

public class Manager extends Employee implements Serializable{ 
    private static final long serialVersionUID = 1L;

	private double hra;
	
	Manager(){}
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
	
	public void displayRecord() {
		System.out.println("Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("Age : "+getAge());
		System.out.println("Gender : "+getGender());
		System.out.println("Basic Salery : "+getBasicSalary());
		System.out.println("HRA : "+getHra());


	}
	
}
