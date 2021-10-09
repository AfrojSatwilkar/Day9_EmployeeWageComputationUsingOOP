package com.company1.EmployeeWageComputationUsingOOps;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program using OOP");

        //creating object for child class
        EmployeeWageChildClass employeeData = new EmployeeWageChildClass();

        //Getting Wages For Working Hour And Days
        employeeData.wagesForWorkingHourAndDays();
    }
}