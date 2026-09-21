package EmployeeManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Default.ConsolInput;

public class AdminEmployee {

	public static Employee[][] addManager(Employee employee[][], int location) {

		System.out.println("How many Manager do you want add.");

		int mangaeCount = ConsolInput.getInt();
		employee[location] = new Manager[mangaeCount];

		for (int i = 0; i < mangaeCount; i++) {
			Manager manager = new Manager();
			System.out.println("Add name.");
			manager.setName(ConsolInput.getString());
			System.out.println("Add address.");
			manager.setAddress(ConsolInput.getString());
			System.out.println("Add age.");
			manager.setAge(ConsolInput.getInt());
			System.out.println("Add gender.");
			manager.setGender(ConsolInput.getString());
			System.out.println("Add basic salary.");
			manager.setBasicSalary(ConsolInput.getDouble());
			System.out.println("Add HRA.");
			manager.setHra(ConsolInput.getDouble());
			employee[location][i] = manager;

		}

		return employee;

	}

	public static Employee[][] addEngineer(Employee employee[][], int location) {
		System.out.println("How many Engineer do you want add.");

		int engineerCount = ConsolInput.getInt();
		employee[location] = new Engineer[engineerCount];

		for (int i = 0; i < engineerCount; i++) {
			Engineer engineer = new Engineer();
			System.out.println("Add name.");
			engineer.setName(ConsolInput.getString());
			System.out.println("Add address.");
			engineer.setAddress(ConsolInput.getString());
			System.out.println("Add age.");
			engineer.setAge(ConsolInput.getInt());
			System.out.println("Add gender.");
			engineer.setGender(ConsolInput.getString());
			System.out.println("Add basic salary.");
			engineer.setBasicSalary(ConsolInput.getDouble());
			System.out.println("Add HRA.");
			engineer.setOverTime(ConsolInput.getDouble());
			employee[location][i] = engineer;
		}

		return employee;
	}

	public static Employee[][] addSalesManager(Employee employee[][], int location) {
		System.out.println("How many Engineer do you want add.");

		int salesManagerCount = ConsolInput.getInt();
		employee[location] = new SalesPerson[salesManagerCount];

		for (int i = 0; i < salesManagerCount; i++) {
			SalesPerson salesperson = new SalesPerson();
			System.out.println("Add name.");
			salesperson.setName(ConsolInput.getString());
			System.out.println("Add address.");
			salesperson.setAddress(ConsolInput.getString());
			System.out.println("Add age.");
			salesperson.setAge(ConsolInput.getInt());
			System.out.println("Add gender.");
			salesperson.setGender(ConsolInput.getString());
			System.out.println("Add basic salary.");
			salesperson.setBasicSalary(ConsolInput.getDouble());
			System.out.println("Add HRA.");
			salesperson.setCommision(ConsolInput.getDouble());
			employee[location][i] = salesperson;
		}

		return employee;
	}

	public static void printEmployee(Employee employee[][]) {
		for (int i = 0; i < employee.length; i++) {
			if (employee[i] != null) {
				for (int j = 0; j < employee[i].length; j++)
					if (employee[i][j] != null) {
						if (employee[i][j] instanceof Manager manager) {
//							Manager manage = (Manager) employee[i][j];
							manager.displayRecord();
						} else if (employee[i][j] instanceof Engineer engineer) {
//							Engineer engineer = (Engineer) employee[i][j];
							engineer.displayRecord();
						} else if (employee[i][j] instanceof SalesPerson salesperson) {
//							SalesPerson salesperson = (SalesPerson) employee[i][j];
							salesperson.displayRecord();
						}
					}
			}
//			break;
		}
	}
	
	public static void savedEmployee(File mainFile,Employee employee[][]) {
		
		
		try(FileOutputStream outputStream = new FileOutputStream(mainFile);
				ObjectOutputStream objoutputStream = new ObjectOutputStream(outputStream);) {
			
			objoutputStream.writeObject(employee);
			
			try {
				if(objoutputStream!=null) {
					objoutputStream.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Employee[][] loadEmployee(File mainFile) {
		
		try(FileInputStream inputStream = new FileInputStream(mainFile);
				ObjectInputStream objinputStream = new ObjectInputStream(inputStream);){
			
			Employee[][] employee = (Employee[][])objinputStream.readObject();
			
			if (objinputStream!= null) {
				objinputStream.close();
			}
			return employee;
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String args[]) throws IOException {
		Employee employee[][] = new Employee[3][];
		File mainFile = new File("D:\\Programming Room\\CDAC_26\\Java_OOPJ\\TestFileio", "EmployeeManagement.txt");

		int choice;
		do {
			System.out.println("Press 1. Add Employee");
			System.out.println("Press 2. Display Employee");
			System.out.println("Press 3. Sort");
			System.out.println("Press 4. Save to file");
			System.out.println("Press 5. Load from file");
			System.out.println("Press 6. Exit.");

			choice = ConsolInput.getInt();
			switch (choice) {
			case 1 -> {
				System.out.println("Press 0. Add Manager.");
				System.out.println("Press 1. Add Engineer.");
				System.out.println("Press 2. Add Sales Manager.");
				System.out.println("Press 3. Back to main manu.");
				final int _manager = 0;
				final int _engineer = 1;
				final int _sales_Manager = 2;
				final int _exit_Menu = 3;

				int num = ConsolInput.getInt();

				if (num == _manager) {
					addManager(employee, num);
				} else if (num == _engineer) {
					addEngineer(employee, num);
				} else if (num == _sales_Manager) {
					addSalesManager(employee, num);
				} else if (num == _exit_Menu) {
					break;
				}
			}
			case 2 -> {
				System.out.println("Eneter number to display employee");

				System.out.println("Press 1. Display Manager.");
				System.out.println("Press 2. Display Engineer.");
				System.out.println("Press 3. Display Sales Manager.");
				final int _Manager = 1;
				final int Engineer = 2;
				final int Sales_Manager = 3;

				int num = ConsolInput.getInt();
				if (num == _Manager) {
					printEmployee(employee);
					System.out.println("===============================================");
				} else if (num == Engineer) {
					printEmployee(employee);
					System.out.println("===============================================");
				} else if (num == Sales_Manager) {
					printEmployee(employee);
					System.out.println("===============================================");
				}
			}
			case 4 -> {
				try {
					mainFile.createNewFile();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				savedEmployee(mainFile,employee);
			}
			case 5 ->{
				Employee[][] emp = loadEmployee(mainFile);
				 if (emp == null) {
				        System.out.println("Employee data could not be loaded.");
				        break;
				    }

				System.out.println("=========== Load Employee Details ============");
				
				
				for(Employee[] e : emp) {
					if(e!=null) {
						System.out.println("Array length : "+e.length);
						for(Employee e1 : e) {
							
							if(e1 != null ) {
								System.out.println("Name         : " + e1.getName());
								System.out.println("Address      : " + e1.getAddress());
								System.out.println("Age          : " + e1.getAge());
								System.out.println("Gender       : " + e1.getGender());
								System.out.println("Basic Salary : " + e1.getBasicSalary());
								if(e1 instanceof Manager manager) {
									System.out.println("HRA      : "+ manager.getHra());
								}
								if(e1 instanceof Engineer engineeer) {
									System.out.println("HRA      : "+ engineeer.getOverTime());
								}
								if(e1 instanceof SalesPerson salesperson) {
									System.out.println("HRA      : "+ salesperson.getCommision());
								}
							}
							
						}
					}
					
				}
			}
			}

		} while (choice != 6);

		System.out.println("Thank you...!");
	}
	
	
}
