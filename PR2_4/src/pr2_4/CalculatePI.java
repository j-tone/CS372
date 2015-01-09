package pr2_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class CalculatePI {
    private int total_SeriesCount;
    private int current_SeriesCount;
    private double denominator;
    private double numerator = 4;
    private double PI_value;
    
    public CalculatePI(){
        PI_value = 4;
        denominator = 3;
        current_SeriesCount = 0;
    }
    public CalculatePI(int max){
        total_SeriesCount = max;
        PI_value = 4;
        denominator = 3;
        current_SeriesCount = 0;
    }
    
    public void set_SeriesCount(int max){
        total_SeriesCount = max;
    }
    
    public double getPI(){
        return PI_value;
    }
    
    public void resetCount(){
        denominator = 3;
        PI_value = 4;
    }
    public void calculate(){
        for (int i = 1; i <= total_SeriesCount; i++){
            current_SeriesCount++;
            PrintOutCurrent();
            if (i % 2 == 0)
                PI_value += (numerator / denominator);
            else
                PI_value -= (numerator / denominator);
            denominator += 2 ;
        }
    }
    
    public void PrintOutCurrent(){
        System.out.printf("Term %d: %-1.8f\n", current_SeriesCount, PI_value);
    }
}
