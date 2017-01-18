
/**
 * Write a description of class Simulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulator
{
    
    
    
    public static void main()
    {
        Menus menuController = new Menus();
        int userInput;
        boolean loop = true;
        
        while (loop)  //   <<<--- ha!
        { 
            userInput = menuController.startMenuList();
            switch (userInput)
            {
                case 1:
                    Player user = new Player();
                    StockMarket market = new StockMarket();
                    break;
                case 2:
                    System.out.println("Come Back Later...");
                    break;
                case 3:
                    menuController.howToPlay();
                    break;
                case 4:
                    loop = false;
                    System.out.println("GAME ENDED");
                    break;
                default:
                    System.out.println("Option not valid");
            }
        }
    }
        

}
