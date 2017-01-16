
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
        StockMarket currentMarket = new StockMarket(); //Creates entire stock market
        Player user = new Player(); //Creates new player for user
        
        currentMarket.printCompanyList(); //currentMarket Object prints all companies within the market
    }
}
