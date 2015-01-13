package pr3_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class Rectangle extends Shape{
    private int w, h;
    
    Rectangle(int width, int height)
        throws IllegalArgumentException
    {
        if (width == 0 || height == 0){
            System.out.println("Can't enter a 0 for a side of a Rectangle, man.");
            throw new IllegalArgumentException();
        }
        w = width;
        h = height;
    }
    
    public double getArea(){
        return w*h;
    }
    public double getPerimeter(){
        return (w*2) + (h*2);
    }
}
