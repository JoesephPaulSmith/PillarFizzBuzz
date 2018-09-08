/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pillarfizzbuzz;

/**
 *
 * @author joexi
 */
public class PillarFizzBuzz {
    
    public String fizz(Integer inputNumber){
        if(inputNumber % 3 == 0){
            return("fizz");
        }
        else if(inputNumber % 5 == 0){
            return("buzz");
        }
        return(inputNumber.toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
