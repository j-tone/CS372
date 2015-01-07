/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_2;

/**
 *This program takes <b>three</b> arguments entered from the command line and outputs them in order.
 * @author Justin
 */
public class PR1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * If there are no arguments, the program says so
         */
        if (args.length == 0)
            System.out.println("You didn't enter any arguments.");
        /**
         * If there are arguments but the user didn't enter enough 
         * (that would be less than three),
         * then the program says so.
         */
        else if (args.length < 3 )
            System.out.println("You didn't enter enough arguments. Enter 3.");
        /**
         * The program takes the correct amount of arguments and outs them in order.
         */
        if (args.length == 3){
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }
    }
    
}
