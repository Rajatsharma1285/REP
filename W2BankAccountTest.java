/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2bankaccounttest;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class W2BankAccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("enter balance amount");
        double b=input.nextDouble();
        System.out.println("enter money to withdraw");
        double w1=input.nextDouble();
        System.out.println("enter money to deposit");
        double d1=input.nextDouble();
        
        SavingAccount s=new SavingAccount(b);
        System.out.println("after withdraw current balance = "+s.withdraw(w1));
        s.setBalance(s.withdraw(w1)); 
        //System.out.println("after withdraw current balance = "+s.getBalance());
        System.out.println("after deposit current balance = "+s.deposit(d1));
    }
    
}
