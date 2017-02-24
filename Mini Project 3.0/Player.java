
/**
 * Write a description of class Player here.
 * 
 * @author (Will) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Player
{
    public String name;
    protected double bankBalance;
    public StockMarket market;
    public Menus menuController = new Menus();
    String adminPassword = "admin";
    
    
    public Player(Player user) //Used for duplicating a user, and overwriting into a new instance
    {
        name = user.name;
        bankBalance = user.bankBalance;
        market = user.market;
    }
    
    public Player(StockMarket userMarket) //Used for creating a new account from scratch
    {
        name = playerName();
        bankBalance = startingBalance();
        market = userMarket;
    }
    
    public String playerName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a username");  // prompts the user for their name
        String userInput = scan.nextLine();  // will save the user input in a variable
        scan.close();
        return userInput;  //returns the variable to Name in Player()
    }
    
     public void printUserInformation()
    {
        System.out.println("");
        System.out.println("Player Details:");
        System.out.println("");
        System.out.println(name);
        System.out.println(bankBalance);
    }
    
    public double adminSetBalance()
    {
        Scanner scan = new Scanner(System.in);
                
        System.out.println("");
        System.out.println("Enter new bank balance:");
                
        double userInput = scan.nextDouble();
        scan.close();
        
        return userInput;
    }
    
    public int startingBalance()
    {
        boolean valid = true;
        int balance = 0; // initialise balance variable
        Scanner scan = new Scanner(System.in);
        while (valid)
        {
            System.out.println("Select a starting balance for the simulation from one of the options below:");
            System.out.println("\t1: £20,000");
            System.out.println("\t2: £30,000");
            System.out.println("\t3: £40,000");
            int userInput = scan.nextInt();
            
            if (userInput == 1)
            {
                balance = 20000;//bankBalance will be set to 20K
                valid = false;//while loop ends
            } 
            else if (userInput == 2)
            {
                balance = 30000;//bankBalance will be set to 30K
                valid = false;//while loop ends
            }
            else if (userInput == 3)
            {
                balance = 40000;//bankBalance will be set to 40k
                valid = false;//while loop ends
            }
            else //in case of unrecognised inputs, display error message
            {
                System.out.println("");
                System.out.println("The value entered does not match any of the options available.");
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("Your bank balance is £" + balance);
        System.out.println("");
        
        scan.close();//close scanner
        return balance;
    }
}
