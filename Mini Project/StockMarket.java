
/**
 * Write a description of class StockMarket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class StockMarket
{
    private ArrayList<StockCompany> companies = new ArrayList<StockCompany>(); // Dynamic size list for storage of companies
    boolean [] ownSharesAchievement = new boolean [8];
    public void sharesAchievement()
    {
        for (int i = 0; i<=7; i++)
        {
            achievedList[i] = false; //No shares have been bought at the start of the simulation
        }
    }
    
    public StockMarket() // Constructor
    {
        for(int i = 0; i < 8; i++) //For loop generates companies at creation of stock market
        {
            String newCoName = ("Company " + (i+1));
            StockCompany newCo = new StockCompany(newCoName, i*246);
            companies.add(newCo); // Adds each company to the ArrayList
        }
    }
    
    public void printCompanyList()
    {
        for(int i = 0; i < companies.size(); i++) //For loop used to print entire companies array
        {
            System.out.println("Name of Company: " + companies.get(i).companyName); // Gets the name of the company in place i
            System.out.println("Company value: " + companies.get(i).currentValue); // Gets the value of a single share for company in place i
        }
    }
}

