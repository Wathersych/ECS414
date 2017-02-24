
/**
 * Write a description of class Simulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Simulator
{      
    public static void main() // from here, the entire program will run
    {
        Scanner scan = new Scanner(System.in);
        StartMenu menu = new StartMenu(); // this will create the start menu for the program
        int userInput;
        boolean loop = true;
        Admin admin;
        
        while (loop)
        { 
            menu.menuList(); //user input is based on the options from the start menu.
            userInput = scan.nextInt();// takes a user input
            switch (userInput)
            {
                case 1:
                    StockMarket market = new StockMarket(); // this will create the stock market for the user to interact with.
                    Player player = new Player(market);  // this will create the user and allow them to interact with the market.
                    player.controlLoop(); //this is where the actual simulation will run.
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
}
