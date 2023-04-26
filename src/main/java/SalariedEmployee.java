
import dhakal.employeetest2.Date;
import dhakal.employeetest2.Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tikad
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, Date birthDate) {
       super(firstName, lastName, socialSecurityNumber, birthDate); 

       if (weeklySalary < 0.0) {
          throw new IllegalArgumentException(
             "Weekly salary must be >= 0.0");
       }

       this.weeklySalary = weeklySalary;
    } 

    // set salary
    public void setWeeklySalary(double weeklySalary) {
       if (weeklySalary < 0.0) {
          throw new IllegalArgumentException(
             "Weekly salary must be >= 0.0");
       }

       this.weeklySalary = weeklySalary;
    } 

    // return salary
    public double getWeeklySalary() {return weeklySalary;}

    // calculate earnings; override abstract method earnings in Employee
    @Override                                                           
    public double earnings() {return getWeeklySalary();}                

    // return String representation of SalariedEmployee object  
    @Override                                                   
    public String toString() {                                  
       return String.format("salaried employee: %s%n%s: $%,.2f",
          super.toString(), "weekly salary", getWeeklySalary());
    }       
}