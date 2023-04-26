/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.employeetest2;

/**
 *
 * @author tikad
 */

public class EmployeeTest2 {
    public static void main(String[] args) {
    Date birth = new Date(7, 24, 1949);
    Date hire = new Date(3, 12, 1988);
    Employee employee = new Employee("Bob", "Blue", birth, hire);

    System.out.println(employee);
    }
}