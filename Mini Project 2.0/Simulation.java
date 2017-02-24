
/**
 * Write a description of class Simulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
public class Simulation extends Frame 
{
    TextArea playerStats;
    Label L1;
    Frame f = new Frame();
    public void textAreaPlayerStats()
    {
        TextArea playerStats = new TextArea("Player Statistics");
        playerStats.setBounds(10,30,300,300);
        f.add(playerStats);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    public Simulation()
    {
        buyButton();
        sellButton();
    }
    
    public static void main()
    {
        Simulation s = new Simulation();
    }
    
    public void sellButton()
    {
        Button sell = new Button("Sell");//create button
        sell.setBounds(100,900,80,30);//position and dimensions
        add(sell);//add to container
        setSize(800,800);//window size
        setLayout(null);//no layout manager
        setVisible(true);//printed on screen
    }
    
    public void buyButton()
    {
        Button buy = new Button("Buy");
        buy.setBounds(100,800,80,30);
        add(buy);
        setSize(800,800);
        setLayout(null);
        setVisible(true);    
    }
}
