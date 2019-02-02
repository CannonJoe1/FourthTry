/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecutorTest;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cannon
 */
public class TwoCounter2 implements Runnable 
{
    @Override
    public void run() 
    {
        try 
        {
            Thread.sleep(50); // does nothing more than pause this thread and yields to others for 5 seconds

            for (int i=0; i<101; i++)
            {
                    PrintStream printf = System.out.printf("TC%d%n", i*2);
            }
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(TwoCounter2.class.getName()).log(Level.SEVERE, null, ex);   
        }
    }

    public static void main(String args[]) 
    {
        (new Thread(new TwoCounter2())).start();
    }

}