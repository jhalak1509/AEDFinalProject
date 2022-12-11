/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.roles;

import businessFramework.Environment;
import businessFramework.enterprises.Enterprises;
import businessFramework.organizations.Organizations;
import businessFramework.userAccount.User;
import javax.swing.JPanel;
import ui.controller.ControllerWorkArea;

/**
 *
 * @author jhalaksurve
 */
public class HealthOnboardControllerRole extends Roles{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, 
            Organizations organization, Enterprises enterprise, Environment business) {
        return new ControllerWorkArea(userProcessContainer, enterprise,business, user);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    } 
    
}
