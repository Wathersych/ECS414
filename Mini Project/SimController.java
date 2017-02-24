
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
