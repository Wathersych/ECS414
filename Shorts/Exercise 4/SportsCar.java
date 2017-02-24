
/**
 * Write a description of class SportsCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SportsCar extends Vehicle
{
    private double topSpeed;
    
    public SportsCar(double hPower, double wght, double tSpeed)
    {
        super(hPower, wght, 0.5);
        topSpeed = tSpeed;
    }
    
    public double getTopSpeed()
    {
        return topSpeed;
    }
    
    
}
