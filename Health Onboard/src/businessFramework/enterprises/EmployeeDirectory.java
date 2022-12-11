/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.enterprises;

import java.util.ArrayList;

/**
 *
 * @author patil
 */
public class EmployeeDirectory {
    private final ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String employeeName) {
        Employee newEmployee = new Employee();
        newEmployee.setEmployeeName(employeeName);
        employeeList.add(newEmployee);
        return newEmployee;
    }
}
