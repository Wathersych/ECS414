
/**
 * Write a description of class Van here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Van extends Vehicle
{
    private double carryWeight;
    
    public Van(double hPower, double aDyno, double wght, double cWght)
    {
        super(hPower, aDyno, wght);
        carryWeight = cWght;
        
    }
    
    public double acceleration(double acceleration, double hPower, double aDyno, double wght)
    {
        acceleration =(100/hPower)*(aDyno/2)*wght/100;
        return acceleration;
    }
    
    public double getCarryWeight()
    {
        return carryWeight;
    }
}
