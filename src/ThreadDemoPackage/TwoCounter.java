/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemoPackage;

/**
 *
 * @author Cannon
 */
public class TwoCounter implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i=0; i<10001; i++)  //increment counter by 1
        {
            System.out.printf("TC%d%n", i*2); //multiplies i by 2, appends it on the end of "TC"
        }
    }

    public static void main(String args[]) 
    {
        (new Thread(new TwoCounter())).start();
    }

}
