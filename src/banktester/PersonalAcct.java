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
public class PersonalAcct extends Account{
    private double minium=100;
    /**
     * constructor
     * pre:none
     * post:a PersonalAcct object created
     */
    public PersonalAcct(double b,String f,String l,String s,String c,String st,String z){
        super(b,f,l,s,c,st,z);
    }
    /**
     * charge money if balance is below 100
     * pre:none
     * post:$2 is charged
     */
    public void chargeMoney(){
        if(super.getBalance()<minium){
            super.withdraw(2);
        }
    }
}
