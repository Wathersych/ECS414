
/**
 * Write a description of class Admin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Admin
{
    Player user;
    final String adminPassword = "Admin";
    AdminMenu menu = new AdminMenu();
    public Admin(Player userAccount)
    {
        user = userAccount; //Stores changes to the user made by the admin
    }
    
    public Player controlLoop()
    {
        System.out.println("");
        System.out.println("ADMIN PASSWORD ACCEPTED...");
        System.out.println("");
        
        boolean quit = false;
        while(!quit)
        {
            menu.menuList(); // input based on method from Menus class
            Scanner scan = new Scanner(System.in);
            int userChoice = scan.nextInt();
            switch (userChoice)
            {
                case 1:
                    user.market.printCompanyList();
                    break;
                case 2:
                    user.market.addCompany();
                    break;
                case 3:
                    user.market.removeCompany();
                    break;
                case 4:
                    user.printUserInformation();
                    break;
                case 5:
                    //Insert change player name function here
                    break;
                case 6:
                    //Ability to set balance goes here
                    break;
                case 7:
                    //print player achievements
                    break;
                case 8:
                    //player selects achievement to award
                    break;
                case 9:
                    //This is the quit option
                    quit = true;
                default:
                    System.out.println("The selection you made was not valid.");
            }
        }
        return user;
    }
}
