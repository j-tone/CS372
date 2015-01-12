package pr2_6;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Justin
 */
public class Averager{
    private ArrayList scores = new ArrayList();
    private int max;
    private int min;
    private double average;
    
    public Averager(){
        max = 0;
        min = 0;
        average = 0;
    }
   
    public void addScore(int newScore){
        scores.add(newScore);
        newMax(newScore);
        newMin(newScore);
    }
    
    public void newMax(int newScore){
        if (newScore > max)
            max = newScore;
    }
    public void newMin(int newScore){
        if ((newScore < min)||(min == 0))
            min = newScore;
    }
    
    public int getMax(){
        return max;
    }
    public int getMin(){
        return min;
    }
    public double getAverage(){
       double total = 0;
       for (int i = 0; i < scores.size(); i++){
           total += (int) scores.get(i);
       }
       return (total / scores.size());
    }
}
