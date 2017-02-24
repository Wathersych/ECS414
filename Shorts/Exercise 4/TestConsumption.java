
/**
 * Write a description of class TestConsumption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestConsumption
{
    public static void main()
    {
        SportsCar sc1 = new SportsCar(200, 1500, 220);
        SportsCar sc2 = new SportsCar(100, 1000, 170);
        SportsCar sc3 = new SportsCar(135, 1100.2, 173);
        
        
        System.out.println("Sportscar one");
        fuelConsumption(sc1);
        System.out.println("Sportscar two");
        fuelConsumption(sc2);
        System.out.println("Sportscar three");
        fuelConsumption(sc3);
    }
    
    public static void fuelConsumption (SportsCar sc)
    {
        double consumption = (1000 + (sc.getWeight()/5))*(sc.getTopSpeed()/100)*(sc.getAerodynamics()*sc.getHorsepower())/10000;
        System.out.println("Fuel consumption is at " + consumption + " units."); 
    }
}
