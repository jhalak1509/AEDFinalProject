
package businessFramework.roles;

import businessFramework.Environment;
import businessFramework.enterprises.Enterprises;
import businessFramework.organizations.Organizations;
import businessFramework.userAccount.User;
import javax.swing.JPanel;
/**
 *
 * @author patil
 */
public abstract class Roles {
     public enum RoleType{
        Administrator("Administrator"),
        Helper("Helper"),
        Manager("Manager"),
        Case("Case"),
        Driver("Driver"),
        Chief("Chief"),
        HealthOnboardController("HealthOnboard Controller"),
        Doctor("Doctor"),
        Sponsor("Sponsor");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User account, 
            Organizations organization, 
            Enterprises enterprise, 
            Environment ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
