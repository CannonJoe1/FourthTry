package ThreadDemoPackage;

/**
 *
 * @author Cannon
 */

public class ThreadDemo 
{

    public static void main(String[] args) 
    {
        TwoCounter tc = new TwoCounter();  //declare an instance of TwoCounter
        tc.run();                          //call run method
        
        FiveCounter fc = new FiveCounter();
        fc.run();
        
    }
}
