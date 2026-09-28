package Predicates;

public class Employee {
	
	private String empName;
	private int empAge;
	private String empAddres;
	private String empDesignation;
	
	
	public Employee() {
		super();
	}


	public Employee(String empName, int empAge, String empAddres, String empDesignation) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empAddres = empAddres;
		this.empDesignation = empDesignation;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public String getEmpAddres() {
		return empAddres;
	}


	public void setEmpAddres(String empAddres) {
		this.empAddres = empAddres;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	
	
	
}
