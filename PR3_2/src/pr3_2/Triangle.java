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
public class Triangle extends Shape{
    private int A, B, C;
    
    Triangle(int s1, int s2, int s3)
            throws IllegalArgumentException,
            ArithmeticException
    {
        if (s1 == 0 || s2 == 0 || s3 == 0){
            System.out.println("Triangles' sides can't be 0, stupid!");
            throw new IllegalArgumentException();
        }
        if ((s1+s2 <= s3)||(s1+s3 <= s2)||(s2+s3 <= s1)){
            System.out.println("Invalid set of numbers for a triangle, dummy.");
            throw new ArithmeticException();
        }
        A = s1;
        B = s2;
        C = s3;
    }
    
    public double getArea(){
        double s = (A + B + C)/2.0;
        return sqrt(s*(s-A)*(s-B)*(s-C));
    }
    public double getPerimeter(){
        return (A+B+C);   
    }
    
}
