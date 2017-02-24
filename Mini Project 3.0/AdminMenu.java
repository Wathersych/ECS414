
/**
 * Write a description of class AdminMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdminMenu extends Menus
{
    public void menuList() // from control loop (in Player class)
    {
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("\t1. View Company List");
        System.out.println("\t2. Add Company");
        System.out.println("\t3. Remove Comany");
        System.out.println("");
        System.out.println("\t4. View Player Details");
        System.out.println("\t5. Edit Player Username");
        System.out.println("\t6. Edit Player Balance");
        System.out.println("");
        System.out.println("\t7. View Player Achievements");
        System.out.println("\t8. Award Player Acheivements");
        System.out.println("");
        System.out.println("\t9. Go Back");                
    }
}
