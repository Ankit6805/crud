package com.factoryDesignPattern;

public class DeveloperClient {

	public static void main(String args[])
	{
		Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
		System.out.println(employee1);
		int salary1 = employee1.salary();
		System.out.println("Salary : "+salary1);
		
		Employee employee2 = EmployeeFactory.getEmployee("Android Developer");
		System.out.println(employee2);
		int salary2 = employee2.salary();
		System.out.println("Salary : "+salary2);
		
	}
	
}
