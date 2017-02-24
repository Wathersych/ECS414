
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Account
{
   private double balance;
   private double interestRate;
    
    public Account(double amount)
    {
        balance = amount;
    } 
         
    public void computeInterest(int n)
    {
        balance = balance * Math.pow((1+interestRate),(n/12));
        System.out.println(balance);
    }
    
    public Account()
    {
        balance = 0; 
    }
    
    public void deposit(double amount)
    {
        balance = balance+amount;
    }
    
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void close()
    {
        balance =0;
    }
    
     public void setInterestRate(double input)
    {
        interestRate = input/100;
    }
}
