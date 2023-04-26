package dhakal.employeetest2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.Month;
import java.time.LocalDate;

/**
 *
 * @author tikad
 */


public class PayrollSystemClass {
    public static void main(String[] args) {
        // create subclass objects                                          
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date(4, 5, 1995));    
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, new Date(10, 23, 1978));  
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06, new Date(7, 19, 1987));                      
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Date(12, 29, 1993));                  

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        // create four-element Employee array
        Employee[] employees = new Employee[4]; 

        // initialize array with Employees        
        employees[0] = salariedEmployee;          
        employees[1] = hourlyEmployee;            
        employees[2] = commissionEmployee;        
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
           System.out.println(currentEmployee); // invokes toString

           // determine whether element is a BasePlusCommissionEmployee
           if (currentEmployee instanceof BasePlusCommissionEmployee) {
              // downcast Employee reference to 
              // BasePlusCommissionEmployee reference
              BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

              employee.setBaseSalary(1.10 * employee.getBaseSalary());

              System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
           } 
           
           // Employee's payment
           double payment = currentEmployee.earnings();
           
           // Add a bonuse of $100 if the current month is the same as the birthday month of the employee
           Month currentMonth = LocalDate.now().getMonth();
           int currentMonthValue = currentMonth.getValue();
           
           if (currentMonthValue == currentEmployee.getBirthDate().getMonth()) {
               payment += 100;
           }
           
           System.out.printf("earned $%,.2f%n%n", payment);
        } 

        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++) {      
           System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());         
        }
    }
}