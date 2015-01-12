/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;
import pr2_6.Averager;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Averager averager = new Averager();
        
        System.out.println("Please enter 10 integers:");
        enterStuff(averager);
        
        System.out.printf("%d is your max.\n", averager.getMax());
        System.out.printf("%d is your min.\n", averager.getMin());
        System.out.printf("%-3.2f is your average.\n", averager.getAverage());
        
    }
    
    public static void enterStuff(Averager a){
    Scanner input = new Scanner(System.in);
        try{
            for (int i = 0; i < 10; i++){
                int p = input.nextInt();
                a.addScore(p);
            }
        }
        catch(Exception e){
            System.out.println("You entered something that wasn't an integer. Do it again.");
            enterStuff(a);
        }
    }
    
}

