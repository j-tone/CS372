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
    private double max;
    private double min;
    private double average;
    
    public Averager(){
        max = 0;
        min = 0;
        average = 0;
    }
   
    public void addScore(double newScore){
        scores.add(newScore);
        newMax(newScore);
        newMin(newScore);
    }
    
    public void newMax(double newScore){
        if (newScore > max)
            max = newScore;
    }
    public void newMin(double newScore){
        if ((newScore < min)||(min == 0))
            min = newScore;
    }
    
    public double getMax(){
        return max;
    }
    public double getMin(){
        return min;
    }
    public double getAverage(){
       double total = 0;
       for (int i = 0; i < scores.size(); i++){
           total += (double) scores.get(i);
       }
       return (total / scores.size());
    }
}
