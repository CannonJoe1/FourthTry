/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;

/**
 *
 * @author user
 */
public class Multiplication implements doMath {
    public void execute(Integer input1, Integer input2){
        Integer multiplication = input1 * input2;
        System.out.println(multiplication);
    }
}
