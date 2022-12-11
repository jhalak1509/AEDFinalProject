/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.UserAccount;

import businessFramework.enterprises.Employee;
import BusinessModel.Roles.Roles;

/**
 *
 * @author patil
 */
public class User {
 private String username;
    private String password;
    private Employee employee;
    private Roles role;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return username;
    }   
}
