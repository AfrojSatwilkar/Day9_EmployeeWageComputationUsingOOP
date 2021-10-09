package com.company1.EmployeeWageComputationUsingOOps;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

    //calculating Wages For Working Hour And Days
    protected void wagesForWorkingHourAndDays(){
        System.out.println("--------Wages for working hours and days---------");
        while (TOTAL_WORKING_DAYS < MAX_WORKING_DAYS && TOTAL_EMP_HRS < MAX_HRS_IN_MONTH){
            getRandomNumber();
            employeeWageUsingSwitch();
            TOTAL_WORKING_DAYS++;
        }
        System.out.println(TOTAL_EMP_HRS);
        TOTAL_SALARY = WAGE_PER_HR * TOTAL_EMP_HRS;
        System.out.println("Total Salary : "+TOTAL_SALARY);
    }

}