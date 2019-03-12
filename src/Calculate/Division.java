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
public class Division implements doMath {
    public void execute(Integer input1, Integer input2){
        Integer division = input2 / input1;
        System.out.println(division);
    }
}
