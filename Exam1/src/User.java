/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Justin
 */
public class User {
    private int cash;
    private String name;
    private String UserName;
    private File f;
    public User(){}
    public User(String Name){
        cash = 500;
        name = Name;
    }
    public User FindOldUser(String username)
    throws Exception{
            f = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\Exam1\\" + username + ".txt");
            if (f.exists() && f.isFile()){
            BufferedReader reader = new BufferedReader(new FileReader(f));
            name = reader.readLine();
            cash = Integer.parseInt(reader.readLine());
            }
            else{
                throw new Exception();
            }
        return this;
    }
    public User setNewUser(String hopeful, String Name)
    throws Exception{
        f = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\Exam1\\" + hopeful + ".txt");
        if (f.exists() && f.isFile()){
            throw new Exception();
        }
        else{
            name = Name;
            cash = 500;
            updateUser();
        }
        return this;
    }
    public void updateCash(int Cash){
        cash += Cash;
        updateUser();
    }
    public String getName(){
        return name;
    }
    public int getCash(){
        return cash;
    }
    public void updateUser(){
        try{
            BufferedWriter updater = new BufferedWriter(new FileWriter(f));
            updater.write(name);
            updater.newLine();
            updater.write(String.format("%d", cash));
            updater.close();
        }
        catch (Exception e){}
    }
}
