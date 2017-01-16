
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
    String [] requirementList = new String[5];
    boolean [] achievedList = new boolean[5];
    
    public void initiateAchievementList()
    {
        achievementList[0] = "";
        achievementList[1] = "Jorden Belfort";
        achievementList[2] = "";
        achievementList[3] = "Monopoly";
        achievementList[4] = "";       
    }
    
    public void initiateRequirementList()
    {
        requirementList[0] = "Earn £20,000";
        requirementList[1] = "Earn £50,000";
        requirementList[2] = "Make your first profit";
        requirementList[3] = "Own Shares in ever company";
        requirementList[4] = "";       
    }
    
    public void InitiateAchievedList()
    {
        for (int i = 0; i<=4; i++)
        {
            achievedList[i] = false; //No achievements have been earned at the start of the simulation
        }
    }
}
