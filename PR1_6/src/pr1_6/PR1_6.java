/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_6;
import java.util.Scanner;
/**
 *A program that finds all the prime numbers in between 2 and a given number by the user.
 * @author Justin
 */
public class PR1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Program asks for a <code>maxNumber</code> and sets <code>maxNumber</code> to the number the user gives it.
         */
        System.out.println("Until what number do you want to find all prime numbers?\n(Starting at 2)");
        Scanner input = new Scanner(System.in);
        int maxNumbers = input.nextInt();
        /**
         * <code>count</code> counts all the prime numbers in runtime
         */
        int count = 0;
        /**
         * The <code>for loop</code> starts at 2 because 1 is not a prime number
         */
        for (int i = 2; i <= maxNumbers; i++){
            boolean primeNumber = true;
            /**
             * if the program finds a number that is fully divisible by any other number that isn't itself,
             * then the program is told that <code>i</code> is no longer a prime number.
             */
            for (int j = 2; j <= maxNumbers; j++){
                if ( ((i % j) == 0)&&(i != j)){
                    primeNumber = false;
                    break;
                }
            }
            /**
             * if <code>i</code> was not divisible by any number other than itself, 
             * then hooray, it's a prime number and gets printed!
             * <code>count</code> gets incremented.
             */
            if (primeNumber == true){
                System.out.printf("%d is a prime number.\n", i);
                count++;
            }
        }
        /**
         * displays total amount of prime numbers within the range
         */
        System.out.printf("There are %d prime numbers from 1 - 10,000\n", count);
    }
    
}
