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
public class Account {
    private double balance;
    private Customer cust;
    /**
     * constructor
     * pre:none
     * post:an Account object created with balance b and customer info
     */
    public Account(double b,String f,String l,String s,String c,String st,String z){
        balance=b;
        cust=new Customer(f,l,s,c,st,z);
    }
    /**
     * withdraw money from account
     * pre:withdraw value more than 0
     * post:subtract w from current balance
     */
    public void withdraw(double w){
        if(w<balance){
            balance-=w;
            System.out.println("you took $"+w+" from your balance");
        }else{
            System.out.println("not enough money");
        }
    }
    /**
     * make deposit to account
     * pre:value more than 0
     * post:add w to current balance
     */
    public void deposit(double w){
            balance+=w;
            System.out.println("you sent $"+w+" to your balance");
    }
    /**
     * return current balance
     * pre:none
     * post:return current balance
     */
    public double getBalance(){
        return balance;
    }
    /**
     * return string for account
     * pre:none
     * post:return current balance
     */
    public String toString(){
        return String.valueOf("current balance is $"+balance);
    }
}
