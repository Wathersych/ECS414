
/**
 * Write a description of class Menus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Menus
{
    public void menu()
    {
        welcomeMessage();
        startMenuList();
    }
    
    public void welcomeMessage()
    {
        System.out.println("Welcome to the Stock Market Simulator");
        System.out.println("");
    }
    
    public int startMenuList()
    {
        Scanner scan = new Scanner(System.in);
        int startMenuUserInput = 0;
        
        System.out.println("1. Start");
        System.out.println("2. LoadGame"); //Currently under development.
        System.out.println("3. How to play");
        System.out.println("4. Quit");
        startMenuUserInput = scan.nextInt();
                
        scan.close();
        
        return startMenuUserInput;
    }
    
    public int adminMenuList()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("\t1. Add Company");
        System.out.println("\t2. Remove Comany");
        System.out.println("\t3. View Company List");
        int userInput = scan.nextInt();
        
        return userInput;
    }
    
    public void howToPlay()
    {
        System.out.println("This will contain a detailed tutorial for the user.");
    }

    
    public int interactTradingMenu()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Trading Menu");
        System.out.println("");
        System.out.println("1. Trade");
        System.out.println("2. Add Company to Market");
        System.out.println("3. Save Game");
        System.out.println("4. Return to Main Menu");
        int simMenuUserInput = scan.nextInt();
        return simMenuUserInput;
    }
    
    public void checkSimMainMenuInput(int simMenuUserInput)
    {
        switch(simMenuUserInput)
        {
            case 1:
                //trade();
            case 2:
                // playerStats();
            case 3:
                // saveGame();
            case 4:
                //menu();
        }
    }
}
