/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.network;

import java.time.LocalDate;
import java.time.LocalTime;
import businessFramework.enterprises.EnterprisesDirectory;
import java.util.ArrayList;
//import java.util.Date;

/**
 *
 * @author vinaykumargudooru
 */
public class Network {
    
    private String country;

    private String state;

    private String city;
    
    private String name;

    private EnterprisesDirectory enterprisesDirectory;
    

    public Network() {
        enterprisesDirectory = new EnterprisesDirectory();
    }

    public EnterprisesDirectory getEnterprisesDirectory() {
        return enterprisesDirectory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return this.city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public ArrayList<Integer> getZipCodesInRange(String city)
    {
        ArrayList<Integer> zipCodeList = new ArrayList<>();
        zipCodeList.add(01245);
        zipCodeList.add(02135);
        
        return zipCodeList;
    }
    
    
}
