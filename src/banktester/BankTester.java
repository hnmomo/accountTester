/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banktester;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class BankTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonalAcct myAcct=new PersonalAcct(900,"fn","ln","street","city","state","123456");
        int c;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("1-deposit\n2-withdraw\n3-check balance\n0-exit");
            c=in.nextInt();
            switch(c){
                case 1:
                    System.out.println("input deposit amount");
                    myAcct.deposit(in.nextInt());
                    break;
                case 2:
                    System.out.println("input withdraw amount");
                    myAcct.withdraw(in.nextInt());
                    break;
                case 3:
                    System.out.println(myAcct);
                    break;
            }
            myAcct.chargeMoney();
        }while(c!=0);
    }
    
}
