/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggaaa.Model;

/**
 *
 * @author Airam
 */
public class Person {
    private final String first_name,adress,email;
    
    public Person(String first_name, String adress, String email){
        this.first_name=first_name;
        this.adress=adress;
        this.email=email;
    }

    public String getName() {
        return first_name;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }
    public String getDomain(){
        return email.substring(email.indexOf("@")+1);
    }
    
}
