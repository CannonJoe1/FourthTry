/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculate;
import java.util.HashMap;
        
/**
 *
 * @author user
 */
public class Controller {
    public static HashMap <String, doMath> key = new HashMap <String, doMath>();
    
    public void Controller(){
    
}
    
    public static void handleOperator(String Operator, Integer input1, Integer input2){
        key.put("+", new Addition());
        key.put("-", new Subtraction());
        key.put("/", new Division());
        key.put("x", new Multiplication());
        
        doMath handler = key.get(Operator);
        handler.execute(input1, input2);
    }

}
