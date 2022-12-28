package com.bridgelabz.employee_wage;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		double empCheck = Math.floor(Math.random()*10)%3; 
		if(empCheck == 1)                                 
		{
			System.out.println("Employee is present");   
			  
		}
		else {
			System.out.println("Employee is absent");   
		}
	}

}
