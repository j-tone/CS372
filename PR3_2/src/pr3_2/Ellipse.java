package pr3_2;
import static java.lang.Math.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class Ellipse extends Shape{
    private int a, b;
    
    Ellipse(int r1, int r2)
        throws IllegalArgumentException
    {
        if (r1 == 0 || r2 == 0){
            System.out.println("You can't enter a radius for an Ellipse as 0, man.");
            throw new IllegalArgumentException();
        }
        a = r1;
        b = r2;
    }
    
    public double getArea(){
        return PI*a*b;
    }
    public double getPerimeter(){
        return PI*((3.0*(a+b))-sqrt(((3.0*a)+b)*(a+(3.0*b))));
    }
}
