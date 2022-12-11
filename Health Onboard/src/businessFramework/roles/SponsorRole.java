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
import ui.sponsors.SponsorWorkArea;

/**
 *
 * @author jhalaksurve
 */
public class SponsorRole extends Roles{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, 
            Organizations organization, Enterprises enterprise, Environment business) {
        return new SponsorWorkArea(userProcessContainer, user, enterprise,organization, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
}
