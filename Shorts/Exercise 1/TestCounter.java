
/**
 * Write a description of class TestCounter here.
 * 
 * @author (William Athersych) 
 * @version (Created on 10/01/17)
 */
public class TestCounter
{
    public static void main()
    {
        Counter ctr = new Counter();  //this will create a counter var called 'ctr' and set it to zero.
        ctr.increment();  //this will increase the value of ctr by 1
        System.out.println("Value of counter: " + ctr.getValue());  //this will print out the value held in ctr
        ctr.reset(); //this will change the value of ctr to 0
        System.out.println("Value of counter: " + ctr.getValue()); 
    }
}
