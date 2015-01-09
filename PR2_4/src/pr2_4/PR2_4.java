/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

/**
 *
 * @author Justin
 */
public class PR2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        //int input = 160;
        //System.out.printf("The number you entered was %d.\n", input);
        CalculatePI pi_calculator = new CalculatePI();
        pi_calculator.set_SeriesCount(input);
        pi_calculator.calculate();
        double PI_approx = pi_calculator.getPI();
        System.out.printf("With %d terms, PI has been calculated to %-1.8f.\n", input, PI_approx);
    }
    
}
