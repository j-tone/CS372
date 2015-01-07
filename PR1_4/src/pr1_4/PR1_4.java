/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_4;
import java.util.Scanner;
/**
 *This program calculates the area of a circle with a given radius
 * @author Justin
 */
public class PR1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the radius of a circle: ");
        /**
         * User enters a value for the radius
         */
        Scanner input = new Scanner(System.in);
        int rad = input.nextInt();
        /**
         * Program calculates the area based on the formula
         */
        double area = (rad * rad) * java.lang.Math.PI;
        /**
         * Program outputs the given radius and its corresponding area of the circle
        */
        System.out.printf("The area of a circle with radius %d is %-4.2f.\n", rad, area);
    }
    
}
