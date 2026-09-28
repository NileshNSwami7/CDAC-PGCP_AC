package Predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckAgeValidation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Add number of Employee:");
		int noOfEmployee = scanner.nextInt();
		scanner.nextLine();
		Employee empArr[] = new Employee[noOfEmployee];
		
		for(int i=0;i<empArr.length;i++) {
			
			Employee emp = new Employee();
			System.out.println("Employee name : ");
			emp.setEmpName(scanner.nextLine());
			System.out.println("Employee age : ");
			emp.setEmpAge(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Employee address : ");
			emp.setEmpAddres(scanner.nextLine());
			System.out.println("Employee designation : ");
			emp.setEmpDesignation(scanner.nextLine());
			empArr[i]=emp;
		}
		
		Predicate<Employee> isValid = e -> e.getEmpAge() >= 25 && e.getEmpDesignation().equals("Manager");
		
		for(Employee em: empArr) {
				
			if(isValid.test(em)) {
				System.out.println("Employee Name : "+em.getEmpName());
				System.out.println("Employee Age : "+em.getEmpAge());
				System.out.println("Employee Address : "+em.getEmpAddres());
				System.out.println("Employee Designation : "+em.getEmpDesignation());

			}
		}
		
	}

}
