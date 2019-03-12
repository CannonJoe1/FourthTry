/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;
import java.util.Scanner;
        
/**
 *
 * @author user
 */
public class CalcApp {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Controller calculate = new Controller();
        Integer input1;
        Integer input2;
        String Operator;
        System.out.println("Enter a number");
        input1 = Integer.parseInt(input.nextLine());
        System.out.println("What are we doing with these numbers? (Add +, Sub -, Divide /, multiply x)");
        Operator = input.nextLine();
        System.out.println("Enter another number");
        input2 = Integer.parseInt(input.nextLine());
        System.out.println("The answer is ");
        Controller.handleOperator(Operator,input1,input2);
    }

    private static class NumberFormatExtension {

        public NumberFormatExtension() {
        }
    }
    
}
