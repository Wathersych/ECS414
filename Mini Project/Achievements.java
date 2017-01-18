
/**
 * Write a description of class Achievements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;


public class Achievements
{
    String [] achievementList = new String[5];
    String [] requirementListPrinted = new String[5];
    int [] requirementListValue = new int[5];
    boolean [] achievedList = new boolean[5];
        
    public void initiateAchievementList() //these will be printed with the achievement requirements
    {
        achievementList[0] = "Getting Started";
        achievementList[1] = "Tycoon";
        achievementList[2] = "High Roller";
        achievementList[3] = "Monopoly";
        achievementList[4] = "Tonald Drump";       
    }
    
    public void initiateRequirementListPrinted() //these will be printed to the user with tne achievement titles
    {
        requirementListPrinted[0] = "Earn £100 profit";
        requirementListPrinted[1] = "Earn £50,000 profit";
        requirementListPrinted[2] = "Earn £100,000 profit";
        requirementListPrinted[3] = "Own shares in 4 company";
        requirementListPrinted[4] = "Own shares in 8 company";       
    }
    
    public void initiateRequirementListValue()
    {
        requirementListValue[0] = 100;
        requirementListValue[1] = 50000;
        requirementListValue[2] = 100000;
        requirementListValue[3] = 4;
        requirementListValue[4] = 8;
    }
    
    public void updateAchievedList(float profits, int shareCompaniesOwnedAmount)//called after each transaction
    {
        for (int i = 0; i<=2; i++)
        {
            if (profits >= requirementListValue[i])
            {
                achievedList[i] = true;
                System.out.println(achievementList[i]);
                System.out.println(requirementListPrinted[i]);
                System.out.println(); //blank space
            }
        }
        
        //int ShareCompaniesOwnedAmount = changeShareCompaniesOwnedAmount();
        
        for (int i = 3; i<=4; i++)
        {
            if (shareCompaniesOwnedAmount>=requirementListValue[3])
            {
                achievedList[i] = true;
            }
            
            if (shareCompaniesOwnedAmount==requirementListValue[4])
            {
                achievedList[i] = true;
            }
        }
    }
    
    public int changeShareCompaniesOwnedAmount(int shareCompaniesOwnedAmount, int [] companySharesOwned)
    {
        shareCompaniesOwnedAmount = 0;
        for (int i = 0; i<=8; i++)
        {
            if (companySharesOwned[i] > 0)
            {
                shareCompaniesOwnedAmount++;
            }
        }
        return shareCompaniesOwnedAmount;
    }
    
    public void initiateAchievedList()
    {
        for (int i = 0; i<=4; i++)
        {
            achievedList[i] = false; //No achievements have been earned at the start of the simulation
        }
    }
}
