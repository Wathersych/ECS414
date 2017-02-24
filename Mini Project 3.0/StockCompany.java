
/**
 * Write a description of class StockCompany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class StockCompany
{
    public String companyName;
    public String companySymbol;
    public float sharePrice;
    public float valueChange;
    public float percentageChange;
    
    ArrayList<String> CompanyOneValues = new ArrayList<String>();
    public StockCompany(String Name, String Symbol, float Value)
    {
        companyName = Name;
        companySymbol = Symbol;
        sharePrice = Value;
        
    }
}
