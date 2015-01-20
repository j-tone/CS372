/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *I ended up not using this class, as I couldn't get it to work in the main program. 
 * I think this is just the result of me over-complicating a loooooot.
 * @author Justin
 */
public class Calendar {
    private ArrayList<String> Events;
    private static File file; 
    public Calendar(){
        Events = new ArrayList();
        file = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\PR3_3\\EventNames\\Events.txt");
    }
    public ArrayList getListNames(){
        return Events;
    }
    public Calendar readinNames()throws Exception{
        BufferedReader in = new BufferedReader(new FileReader(file));
        try{
            String name;
            while ((name = in.readLine())!= null)
                Events.add(name);
            in.close();
        }
        catch (Exception e){}
        return this;
    }
    public void addName(String s) throws Exception{
        Events.add(s);
        BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
        try{
            out.newLine();
            out.write(s);
            out.close();
        }
        catch (Exception e){}
    }
}
