
/**
 * Write a description of class Exercise3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class Exercise3
{
    public static void main(String[] args)
    {
       if (args.length == 3)
       {
           double[] values = new double[3];
           for(int i=0; i<=2; i++)
           {
               values[i] = Double.parseDouble(args[i]);
           }
           
           values = sortValues(values);
           printSortedValues(values);
       } 
       else
       {
           System.out.println("Error");
       }
       
    }
    
       
    public static double[] sortValues(double[] values)
    {
        boolean mark = true;
        double temp; //temp holding variable.
        
        while (mark)
        {
            mark = false; //set to false - wating for a swap.
            for (int i=0; i<=1; i++)
            {
                if (values[i] > values[i+1])
                {
                    temp = values[i]; //swap elements
                    values[i] = values[i+1];
                    values[i+1] = temp;
                    mark = true; //this only happens if swap occurs (otherwise, while loop ends.
                }
            }
        }
        
        return values;
    }
    
    public static void printSortedValues(double[] values)
    {
        System.out.println(values[1] + " is between " + values[0] + " and " + values[2]);
    }
}