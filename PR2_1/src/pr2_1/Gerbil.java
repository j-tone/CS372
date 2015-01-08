/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_1;

/**
 *
 * @author Justin
 */
public class Gerbil {
    private int gerbilNumber;
    public Gerbil(int number){
        gerbilNumber = number+1;
    }
    public void hop(){
        System.out.printf("Gerbil %d is hopping!\n", gerbilNumber);
    }
}
