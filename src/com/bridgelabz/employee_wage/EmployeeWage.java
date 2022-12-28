package com.bridgelabz.employee_wage;

public class EmployeeWage {
	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation");
		int Wage_Per_Hr = 20;                    
		int Working_Hr = 8;                      
		double dailyWage;    
		int Part_time_hr = 4;
		
		double empCheck = Math.floor(Math.random()*10)%3; 
		if(empCheck == 1)                                 
		{
			System.out.println("Employee is present");   
			dailyWage = Wage_Per_Hr * Working_Hr;     
			System.out.println(dailyWage);  
		}
		
		else if (empCheck == 2)
		{
			System.out.println("Employee's part time");
			dailyWage = Wage_Per_Hr * Part_time_hr;     
			System.out.println(dailyWage);  

		}
		
		else {
			System.out.println("Employee is absent");   
		}
	}

}
