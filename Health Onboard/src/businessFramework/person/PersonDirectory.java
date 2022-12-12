/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.person;

import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class PersonDirectory {
    
    private ArrayList<Helper> helperList;
    private ArrayList<Case> customerList;
    private ArrayList<Person> personList;
    
    public PersonDirectory()
    {
          helperList = new ArrayList<>();
          customerList = new ArrayList<>();
          personList = new ArrayList<>();
    }
      
      public Helper addHelper()
    {
        Helper helper = new Helper();
        helperList.add(helper);
        return helper;
    }
    
    public void removeHelper(Helper helper)
    {
      helperList.remove(helper);
    }
    
    public Case addCustomer()
    {
        Case customer = new Case();
        customerList.add(customer);
        return customer;
    }
    
    public void removeCustomer(Case customer)
    {
        customerList.remove(customer);
    }
    

    public ArrayList<Case> getCustomerLsit() {
        return customerList;
    }

    public ArrayList<Helper> getHelperList() {
        return helperList;
    }


      public Person addPerson()
    {
        Person person = new Person();
       personList.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
}
