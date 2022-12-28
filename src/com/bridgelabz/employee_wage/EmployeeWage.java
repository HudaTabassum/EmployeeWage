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
	    int maxi_Hrs_In_Month = 100;
	    int total_Employee_Hrs = 0;
	    int total_Working_Days = 0;
	    while (total_Employee_Hrs <= maxi_Hrs_In_Month &&
	    		total_Working_Days < workingDaysPerMonth) {
	    	total_Working_Days++; {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case 1:
                        System.out.println("Employee is Present");
                        Working_Hr = 8;
                        break;
                    case 2:
                        System.out.println("Employee is Part-Time Present");
                        Working_Hr = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        Working_Hr = 0;
                }
                total_Employee_Hrs = Working_Hr + total_Employee_Hrs;
                System.out.println("Day:" + total_Working_Days + " EmpHour: " + Working_Hr);
            }
            int totalEmployeeWage = total_Employee_Hrs * Wage_Per_Hr;
            System.out.println("Total Employee Wage " + totalEmployeeWage);
        }

	}
}
