/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *This class holds all the methods I need for checking if an even is valid, 
 * and writing to and reading 
 * from the file.
 * @author Justin
 */
public class CalendarEvent {
    private String EventName;
    private String EventLocation;
    private String EventDate;
    private String FileName;
    int month, day, year;
    private File f;
    /*
    These constructors were meant for sorting the list
    */
    public CalendarEvent(){}
    public CalendarEvent(File F){
        f = F;
        try{
        readFromFile();
        }
        catch (Exception e){System.out.println("That's not good.");}
    }
    /*
    this constructor will only build the event if everything works out.
    */
    public CalendarEvent(String name, String location, int a, int b, int c) throws Exception{
        int count = 1;
        f = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\PR3_3\\" + name + ".txt");
        while(f.exists() && f.isFile()){
            f = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\PR3_3\\" + name + count + ".txt");
            count++;
        }
        f.createNewFile();
        FileName = name;
        if (count > 1)
            FileName = name + (count-1);
        
        EventLocation = location;
        EventName = name;
        if (c < 2015 || c > 9999)
            throw new Exception();
        else 
            year = c;
        if (a > 12 || a < 1)
            throw new Exception();
        else
            month = a;
        switch (a){
            case 1:
            case 3:
            case 5: 
            case 7:
            case 8:
            case 10:
            case 12:
                if (b < 32 && b > 0){
                    day = b;
                    EventDate = String.format("%d / %d / %d", month, day, year);
                    
                }
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (b < 31 && b > 0){
                    day = b;
                    EventDate = String.format("%d / %d / %d", month, day, year);
                }
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
                    day = b;
                    EventDate = String.format("%d / %d / %d", month, day, year);
                }
                break;
            default:
                throw new Exception();
        }
        writeToFile();
    }
   /*
    useful function: writes everything to a file.
    */
    public void writeToFile() throws Exception{
        BufferedWriter out = new BufferedWriter(new FileWriter(f));
        try{
            out.write(EventName); out.newLine();
            out.write(EventLocation); out.newLine();
            out.write(EventDate); out.newLine();
            out.close();
        }
        catch (Exception e){throw new Exception();}
    }
    /*
    ended up not needing this function. My plans for this assignment
    changed drastically a few times.
    */
    public CalendarEvent readFromFile()throws Exception{
        BufferedReader in = new BufferedReader(new FileReader(f));
        try{
            EventName = in.readLine();
            EventLocation = in.readLine();
            EventDate = in.readLine();
            in.close();
            Matcher m = Pattern.compile("\\d+").matcher(EventDate);
            m.find(); month = Integer.parseInt(m.group());
            m.find(); day = Integer.parseInt(m.group());
            m.find(); year = Integer.parseInt(m.group());
        }
        catch(Exception e){throw new Exception();}
        return this;
    }
    /*
    getter functions.
    Because getting information is useful.
    It also makes it look like I worked harder on this class.
    */
    public String getName(){
        return EventName;
    }
    public String getLocation(){
        return EventLocation;
    }
    public Integer getMonth(){
        return month;
    }
    public Integer getDay(){
        return day;
    }
    public Integer getYear(){
        return year;
    }
    public String getDate(){
        return EventDate;
    }
    public String getFileName(){
        return FileName;
    }
    public File getFile(){
        return f;
    }
}
