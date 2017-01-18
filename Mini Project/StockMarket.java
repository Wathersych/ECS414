
/**
 * Write a description of class StockMarket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class StockMarket
{
    private ArrayList<StockCompany> companies = new ArrayList<StockCompany>(); // Dynamic size list for storage of companies
    boolean [] ownSharesAchievement = new boolean [8];
    /*public void sharesAchievement()
    {
        for (int i = 0; i<=7; i++)
        {
            achievedList[i] = false; //No shares have been bought at the start of the simulation
        }
    }*/
    
    public StockMarket() // Constructor
    {
        for(int i = 0; i < 8; i++) //For loop generates companies at creation of stock market
        {
            String newCoName = ("Company " + (i+1));
            String newCoSymbol = ("SYM" + (i+1));
            StockCompany newCo = new StockCompany(newCoName,newCoSymbol, i*246);
            companies.add(newCo); // Adds each company to the ArrayList
        }
        printCompanyList();
    }
    
    public void printCompanyList()
    {
        for(int i = 0; i < companies.size(); i++) //For loop used to print entire companies array
        {
            System.out.println("Name of Company: " + companies.get(i).companyName); // Gets the name of the company in place i
            System.out.println("Company Symbol: " + companies.get(i).companySymbol); // Gets the company symbol
            System.out.println("Company value: " + companies.get(i).sharePrice); // Gets the value of a single share for company in place i
        }
    }
    
    public void addCompany()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the company's name?");
        String name = scan.nextLine();
        System.out.println("What is the company's symbol?");
        String symbol = scan.nextLine();
        System.out.println("What is the company's current stock value?");
        float value = scan.nextFloat();
        StockCompany newCo = new StockCompany(name, symbol, value);
        companies.add(newCo);
    }
    

}

