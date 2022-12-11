
package BusinessModel.Roles;
import businessFramework.Environment;
import BusinessModel.UserAccount.User;
import javax.swing.JPanel;
/**
 *
 * @author patil
 */
public abstract class Roles {
     public enum RoleType {  
        SysAdmin("Sysadmin"),
        HospitalAdmin("HospitalAdmin"),
        BloodBankAdmin("BloodBankAdmin"),
        PoliceAdmin("PoliceAdmin"),
        PharmaAdmin("PharmaAdmin");

        private final String value;

        private RoleType(String value) {
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
            User user,
            Environment system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
