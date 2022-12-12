/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.enterprises;

import businessFramework.enterprises.Enterprises.EnterprisesType;
import businessFramework.roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class UniversityEnterprises extends Enterprises {
    
     public UniversityEnterprises(String name) {
        super(name, EnterprisesType.University);
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }
    
}
