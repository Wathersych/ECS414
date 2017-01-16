
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter
{
       private int count;  
       
       public Counter(int initialCount) 
       {  
           count = initialCount;    
       }
       
       public Counter() 
       {  
           count = 0;
       }
       
       public void increment() 
       {  
           count += 1;    
       } 
       
       public void reset() 
       {  
           count = 0;
       }   
       
       public int getValue() 
       {  
           return count;    
       }
}
