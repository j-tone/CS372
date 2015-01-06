/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Justin
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hour = 16;
        int minute = 51;
        int second = 47;
        int ssm = (hour * 60 * 60) + (minute * 60) + second;
        System.out.printf("There are %d seconds since Midnight.\n", ssm);
        
        int totalseconds = (24 * 60 * 60);
        int stm = totalseconds - ssm;
        System.out.printf("There are %d seconds left in the day.\n", stm);
        
        double Percentleft = (stm / (24.0 * 60 * 60)) * 100;
        System.out.printf("There is %-2.2f%% of the day remaining.\n", Percentleft);
    }
    
}
