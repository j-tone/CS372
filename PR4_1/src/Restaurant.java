/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
/**
 *
 * @author Justin
 */
public class Restaurant {
    private String name;
    private String location;
    private File file;
    private String filename;
    private String stars;
    private int starcount;
    private String description;
    //PT -- why have this?
    public Restaurant(){}
    //PT -- javadoc? -4
    public Restaurant(String Name, String Location, String Description, int Starcount)throws Exception{
        name = Name;
        location = Location;
        description = Description;
        int count = 1;
        file = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\PR4_1\\" + name + ".txt");
        while(file.exists() && file.isFile()){
            file = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\PR4_1\\" + name + count + ".txt");
            count++;
        }
        file.createNewFile();
        filename = name;
        if (count > 1)
            filename = name + (count-1);
        starcount = Starcount;
        setStarCount(Starcount);
    }
    public void setStarCount(int Starcount)throws Exception{
        switch (Starcount){
            case 1:
                stars = "*";
                break;
            case 2: 
                stars = "**";
                break;
            case 3:
                stars = "***";
                break;
            case 4: 
                stars = "****";
                break;
            case 5:
                stars = "*****";
                break;
            default://PT -- good
                throw new Exception();
        }
    }
    public void writeToFile()throws Exception{
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        try{
            out.write(name); out.newLine();
            out.write(location); out.newLine();
            out.write(stars); out.newLine();
            out.write(description);
            out.close();
        }
        catch(Exception e){
            throw new Exception();
        }
    }
    public Restaurant readFromFile(File f)throws Exception{
        file = f;
        BufferedReader in = new BufferedReader(new FileReader(file));
        try{
            name = in.readLine();
            location = in.readLine();
            stars = in.readLine();
            description = in.readLine();
        }
        catch(Exception e){
            throw new Exception();
        }
        return this;
    }
    public String getFileName(){
        return filename;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public String getStars(){
        return stars;
    }
    public int getStarCount(){
        return starcount;
    }
    public String getDescription(){
        return description;
    }
}
