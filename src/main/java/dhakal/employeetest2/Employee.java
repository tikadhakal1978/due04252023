/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhakal.employeetest2;

/**
 *
 * @author tikad
 */
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Date birthDate;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.socialSecurityNumber = socialSecurityNumber;
       this.birthDate = birthDate;
    } 

    // return first name
    public String getFirstName() {return firstName;}

    // return last name
    public String getLastName() {return lastName;}

    // return social security number
    public String getSocialSecurityNumber() {return socialSecurityNumber;}
    
    public Date getBirthDate() {return birthDate;}

    // return String representation of Employee object
    @Override
    public String toString() {
       return String.format("%s %s%nsocial security number: %s", 
          getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
}

