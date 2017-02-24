
/**
 * Write a description of class GameController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class SimController
{
    public StockMarket userMarket = new StockMarket();
    public Player player = new Player(userMarket);
    public StartMenu menu = new StartMenu();
    
    public void startGameLoop()
    {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop)
        { 
            menu.menuList(); //user input is based on the options from the start menu.
            int userInput = scan.nextInt();// takes a user input
            switch (userInput)
            {
                case 1:
                    StockMarket market = new StockMarket(); // this will create the stock market for the user to interact with.
                    Player player = new Player(market);  // this will create the user and allow them to interact with the market.
                    controlLoop(); //this is where the actual simulation will run.
                    break;
                case 2:
                    System.out.println("Come Back Later..."); // load game will require I/O.
                    break;
                case 3:
                    menu.howToPlay(); // this will give the user a tutorial.
                    break;
                case 4:
                    loop = false;
                    System.out.println("GAME ENDED"); // this will end the entire program.
                    break;
                default:
                    System.out.println("Option not valid"); // the user has inputted an unlisted option.
            }
        }
    }
    public void controlLoop()
    {
        boolean quit = false;
        while(!quit)
        {
            Scanner scan = new Scanner(System.in);
            int userChoice = 0;
            GameMenu playerMenu = new GameMenu();
            System.out.println("Main Menu");
            System.out.println("");
            playerMenu.menuList();
            
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
                    System.out.println(player.bankBalance);
                    break;
                case 4:
                    //save game to file
                    break;
                case 5:
                     //startMenu.MenuList(); //quits to start menu
                     //break;
                case 6:
                    String adminPassword = getAdminPasswordIn();  
                
                    boolean password = adminPasswordCheck(adminPassword);
                    if (password)
                    {
                       Admin admin = new Admin(player);
                       player = admin.controlLoop(); //This returns all the updated player data
                    }
                    else
                    {
                        System.out.println("Password was incorrect");
                    }
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
    
    public String getAdminPasswordIn()
    {
        System.out.println("Enter admin password");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        scan.close();
        return password;
    }
}
