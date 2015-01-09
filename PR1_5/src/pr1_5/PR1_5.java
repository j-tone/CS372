/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_5;
import java.util.Random;
/**
 *This program compares a random number to another random number, 25 times.
 * @author Justin
 */
public class PR1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * It's gotta go 25 times
         */
        for (int i = 0; i < 25; i++){
            /**
             * Initialized a random number generator and then the
             * two next numbers in the sequence to be compared
             */
             //PT: As mentioned in class, you don't need to create a new Random object each time through the loop
            Random generator = new Random();
            int number = generator.nextInt(100);
            int number1 = generator.nextInt(100);
            /**
             * If, for some reason, the numbers are equal, then it'll say so
             */
            if (number == number1){
                System.out.println("The numbers are the same.\n");
            }
            /**
             * If the first is greater, it prints it
             */
            else if (number > number1){
                System.out.printf("%d is greater than %d.\n", number, number1);
            }
            /**
             * if the first is less, it prints it
             */
            else if (number < number1){
                System.out.printf("%d is less than %d.\n", number, number1);
            }
        }
            
        }
    }
    
}
