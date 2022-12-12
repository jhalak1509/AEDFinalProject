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
import ui.systemAdmin.SysAdminWorkArea;

/**
 *
 * @author jhalaksurve
 */
public class SysAdmin extends Roles{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Organizations organization, Enterprises enterprise, Environment system) {
        return new SysAdminWorkArea(userProcessContainer, system);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
}
