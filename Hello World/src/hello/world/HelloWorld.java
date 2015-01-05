/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello.world;
import java.util.Scanner;
/**
 *
 * @author Justin
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Justin";
        System.out.printf("Hello %s, what was your score? ", name);
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        System.out.printf("Your score is %d\n", score);
        
        System.out.printf("And what is your favorite color? ");
        Scanner input1 = new Scanner(System.in);
        String color = input1.nextLine();
        System.out.printf("Your favorite color is: %s\n", color);
    }
    
}
