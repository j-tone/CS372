/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Justin
 */
public class Die {
    private Random value;
    public Die(){
        value = new Random();
    }
    public int roll(){
        int nextValue = value.nextInt();
        while (nextValue < 0){
            nextValue = value.nextInt();
        }
        return (nextValue % 6) + 1;
    }
}
