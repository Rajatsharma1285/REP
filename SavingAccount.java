/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2bankaccounttest;

/**
 *
 * @author admin
 */
public class SavingAccount extends Account
{
    public SavingAccount(double balance)
    {
        super(balance);
    }
    public double withdraw(double w)
    {
        return getBalance()-w;
    }
    public double deposit(double d)
    {
        return getBalance()+d;
    }
}
