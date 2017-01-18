
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


    
    public void howToPlay()
    {
        //how to play.....   
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
