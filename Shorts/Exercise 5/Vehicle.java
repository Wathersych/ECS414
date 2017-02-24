
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle
{
    private double horsepower;
    private double aerodynamics;
    private double weight;
    
    public Vehicle(double hPower, double wght, double aDyno)
    {
        horsepower = hPower;
        weight = wght;
        aerodynamics = aDyno;
    }
    
    public double acceleration()
    {
        double acceleration =(100/horsepower)*aerodynamics*weight/100;
        return acceleration;
    }
    
    public double getHorsepower()
    {
        return horsepower;
    }
    
    public double getAerodynamics()
    {
        return aerodynamics;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
}
