/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banktester;

/**
 *
 * @author jihua5758
 */
public class Customer {
    private String firstName,lastName,street,city,state,zip;
    /**
     * constructor
     * pre:none
     * post:a Customer object created
     */
    public Customer(String f,String l,String s,String c,String st,String z){
        firstName=f;
        lastName=l;
        street=s;
        city=c;
        state=st;
        zip=z;
    }
    /**
     * returns a String of customer information
     * pre:none
     * post:the customer information is returned
     */
    public String toString(){
        return firstName+" "+lastName+" "+street+" "+city+" "+state+" "+zip;
    }
}
