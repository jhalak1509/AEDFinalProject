/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.userAccount;

import businessFramework.person.Person;
import businessFramework.roles.Roles;
import java.util.ArrayList;


/**
 *
 * @author jhalaksurve
 */
public class UserDirectory {
    
    private ArrayList<User> userList;
    
    public UserDirectory()
    {
      userList = new ArrayList<>();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public User validateUser(String name, String pwd){
        for (User u : userList)
            if (u.getName().equals(name) && u.getPwd().equals(pwd)){
                return u;
            }
        return null;
    }
    
    public User addUser(String name, String pwd, Person person, Roles role){
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        user.setPerson(person);
        user.setRole(role);
        userList.add(user);
        return user;
    }
    
    public boolean checkUniqueName(String name){
        boolean flag = true;
        for (User u : userList){
            if (u.getName().equals(name))
            {
              flag =  false;
            }
            else
            {
            flag =  true;
            }
        }
        return flag;
    }
    
    public void deleteUser(User user)
    {
        userList.remove(user);
    }
    
    
}
