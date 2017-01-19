
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
    private float bankBalance;
    public StockMarket market;
    private Menus menuController = new Menus();
    
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
            int userChoice = menuController.adminMenuList();
            switch (userChoice)
            {
                case 1:
                    market.addCompany();
                    break;
                case 2:
                    market.removeCompany();
                    break;
                case 3:
                    market.printCompanyList();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("The selection you made was not valid.");
            }
        }
    }
}
