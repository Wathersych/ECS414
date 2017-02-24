
/**
 * Write a description of class TestAccountInterest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestAccountInterest
{
    
    
    public static void main()
    {
        Account account1 = new Account(500);
        Account account2 = new Account(100);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an interest rate (%):");
        double input = scan.nextDouble();
        account1.setInterestRate(input);
        
        account2.setInterestRate(input);
        
        System.out.println("12 month test");
        account1.computeInterest(12);
        account2.computeInterest(12);
        System.out.println("");
        System.out.println("24 month test");
        account1.computeInterest(24);
        account2.computeInterest(24);
        
    }
    
   
    }
