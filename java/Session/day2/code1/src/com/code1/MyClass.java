package com.code1;

class Employee {
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//constructor
	Employee(int employeeId, String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
} 
	//Method
	void display() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Salary : " + employeeSalary);
		
	}
}
public class MyClass {

	public static void main(String[] args) {
		Employee empl = new Employee(101,"Dhanu",2000.0f);
		empl.display();
		
		Employee emp2 = new Employee(102,"Dhanush",3000.0f);
		emp2.display();
		
	
        
	}

}
