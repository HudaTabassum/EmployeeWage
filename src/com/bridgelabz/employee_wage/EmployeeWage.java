package com.bridgelabz.employee_wage;

public class EmployeeWage {
	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation");
		int Wage_Per_Hr = 20;                    
		int Working_Hr;                      
		double dailyWage =0;    
		int Part_time_hr = 4;
		int workingDaysPerMonth = 20;
		double monthlyWage = 0;
		for(int day = 0; day < workingDaysPerMonth; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    System.out.println("Employee is Present");
                    Working_Hr= 8;
                    break;
                case 2:
                    System.out.println("Employee is Part-Time Present");
                    Working_Hr = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    Working_Hr= 0;
            }
            dailyWage = Working_Hr * Wage_Per_Hr;
            monthlyWage = dailyWage + monthlyWage;
            System.out.println("Daily wage of employee is "+ dailyWage);
        }
		
		System.out.println("-------------------");
        System.out.println("Monthly employee wage is "+ monthlyWage);
	}

}
