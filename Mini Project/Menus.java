
/**
 * Write a description of class Menus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Menus
{
    
    public int startMenuList() //this is the menu with options for the user, before they have begun a simulation.
    {
        Scanner scan = new Scanner(System.in);
        int startMenuUserInput = 0;
        
        System.out.println("1. Start"); // start a simulation.
        System.out.println("2. LoadGame"); //Currently under development.
        System.out.println("3. How to play"); // will be interactive....if possible.");
        System.out.println("4. Quit"); // close the program.
        //When creating admin option, stress that a PLAYER must be created first
        startMenuUserInput = scan.nextInt();
                
        scan.close(); // close scanner.
        
        return startMenuUserInput; // return to main
    }
    
    public void gameMenuList()
    {
        System.out.println("\t1. Buy Stocks");
        System.out.println("\t2. Sell Stocks");
        System.out.println("\t3. Check Stats");
        System.out.println("\t4. Save Game");
        System.out.println("\t5. Quit");
        System.out.println("");
        System.out.println("\t6. Enter Admin Mode");
    }
    
    public void adminMenuList()
    {
        System.out.println("Print admin menu list here");
    }
    
    public void howToPlay()// tutorial on how to play the sim.
    {
        System.out.println("This will contain a detailed tutorial for the user.");
    }
}