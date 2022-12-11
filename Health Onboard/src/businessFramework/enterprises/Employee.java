/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.enterprises;

/**
 *
 * @author patil
 */
public class Employee {
    private String employeeName;
    private final int employeeId;
    private static int employeeCount = 1;

    public Employee() {
        this.employeeId = employeeCount;
        employeeCount++;
    }

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }
    
    @Override
    public String toString(){
        return this.employeeName;
    }
}
