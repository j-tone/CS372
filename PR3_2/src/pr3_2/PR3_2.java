/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
/**
 *
 * @author Justin
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hey man, enter some values for sides of a rectangle.");
        ArrayList<Integer> recValues = getValues(2);
        try{
            Rectangle box = new Rectangle(recValues.get(0),recValues.get(1));
            System.out.printf("%.0f is the area of this particular rectangle,\nand %.0f is the perimeter.\n",
                box.getArea(), box.getPerimeter());
        }
        catch(Exception ex){}
        
        System.out.println("Now if you would, please enter three values for sides of a triangle.");
        ArrayList<Integer> triValues = getValues(3);
        try{
            Triangle slice = new Triangle(triValues.get(0), triValues.get(1), triValues.get(2));
            System.out.printf("%.2f is the area of the triangle you entered.\n%.0f is the perimeter!\n", 
                slice.getArea(), slice.getPerimeter());
        }
        catch(Exception ex){}
        
        System.out.println("So. Enter some values to be radii for an ellipse.");
        ArrayList<Integer> ellValues = getValues(2);
        try{
        Ellipse elliptical = new Ellipse(ellValues.get(0), ellValues.get(0));
        System.out.printf("%.2f is the area of the calculated ellipse.\n%.2f is the approximated perimeter!\n", 
                elliptical.getArea(), elliptical.getPerimeter());
        }
        catch(Exception ex){}
    }
    
    public static ArrayList<Integer> getValues(int times){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intSet = new ArrayList<Integer>();
        
        for (int i = 0; i < times; i++){
            try{
                intSet.add(input.nextInt());
            }
            catch(InputMismatchException ex){
                System.out.println("Gotta enter integers, man! Enter again.");
                times++;
                input.nextLine();
            }
        }
        
        return intSet;
    }
}
