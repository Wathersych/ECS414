
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
    protected Menus menuController = new Menus();
    
    public Player(Player user) //Used for duplicating a user, and overwriting into a new instance
    {
        name = user.name;
        bankBalance = user.bankBalance;
        market = user.market;
    }
    
    public Player(StockMarket userMarket)
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
    
    public void adminSetBalance()
    {
        Scanner scan = new Scanner(System.in);
                
        System.out.println("");
        System.out.println("Enter new bank balance:");
        
        double userInput = scan.nextDouble();
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
                balance = 20000;
                valid = false;
            } 
            else if (userInput == 2)
            {
                balance = 30000;
                valid = false;
            }
            else if (userInput == 3)
            {
                balance = 40000;
                valid = false;
            }
            else
            {
                System.out.println("");
                System.out.println("The value entered does not match any of the options available.");
                System.out.println("");
            }
        }
        
        scan.close();
        return balance;
    }
    
    public void controlLoop()
    {
        boolean quit = false;
        while(!quit)
        {
            Scanner scan = new Scanner(System.in);
            int userChoice = 0;
            
            System.out.println("Main Menu");
            System.out.println("");
            menuController.gameMenuList();
            
            userChoice = scan.nextInt();
            
            switch (userChoice)
            {
                case 1:
                    //buy stocks
                    break;
                case 2:
                    //sell stocks
                    break;
                case 3:
                    System.out.println(bankBalance);
                    break;
                case 4:
                    //save game to file
                    break;
                case 5:
                    //quit to main menu
                    break;
                case 6:
                    //boolean password = adminPasswordCheck(adminPassword);
                    //if (password)
                    //{
                        //enter admin's control loop
                    //}
                    break;      
                default:
                    System.out.println("The selection you made was not valid.");
            }
            scan.close();
        }
        
    }
    
    public boolean adminPasswordCheck(String adminPassword)
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        System.out.println("Enter the password for admin mode:");
        String userinput = scan.nextLine();
        if (userinput == adminPassword)
        {
            valid = true;
        }
        else 
        {
            valid = false;
        }
        
        scan.close();
        
        return valid;
    }
}
