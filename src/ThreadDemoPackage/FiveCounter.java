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
public class FiveCounter implements Runnable  
{
    @Override
    public void run() 
    {
        for (int i=0; i<10001; i++)
        {
            System.out.printf("FC%d%n", i*5);
        }
    }

    public static void main(String args[]) 
    {
        (new Thread(new FiveCounter())).start();
    }
    
}
