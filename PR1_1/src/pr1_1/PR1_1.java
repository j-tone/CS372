/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_1;

/**
 *
 * @author Justin
 */
public class PR1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataOnly d = new DataOnly();
        d.i = 47;
        d.f = 1.1f;
        d.b = false;
        System.out.printf("%d is the integer in DataOnly\n", d.i);
        System.out.printf("%-1.1f is the float in DataOnly\n", d.f);
        System.out.printf("%s is the boolean in DataOnly\n", d.b);
    }
    
}
