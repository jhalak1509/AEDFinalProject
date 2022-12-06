package BusinessModel.UserAccount;

import BusinessModel.Employee.Employee;
import java.util.ArrayList;
import BusinessModel.Roles.Roles;

/**
 *
 * @author patil
 */
public class UserDirectory {
  private final ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userList;
    }

    public User authenticateUser(String username, String password) {
        System.out.println("username ---"+ username);
          System.out.println("password ---"+password);
        for (User ua : userList) {
            System.out.println("username ---"+ ua.getUsername());
          System.out.println("password ---"+ua.getPassword());
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public User createUser(String username, String password, Employee employee, Roles role) {
        System.out.println("----user details----");
        System.out.println("----user name----"+username);
        System.out.println("----user password----"+password);
        System.out.println("----user role----"+role);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmployee(employee);
        user.setRole(role);
        userList.add(user);
        return user;
    }
    public void deleteUser(String username){
       
    for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                userList.remove(ua);
                break;
            }
        }
        
    }
    public boolean findIfUsernameIsUnique(String username) {
        for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
        public boolean checkIfUsernameIsUnique(String username) {
        for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }   
}
