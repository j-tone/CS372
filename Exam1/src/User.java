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
    File f;
    public User(){}
    public User(String Name){
        cash = 500;
        name = Name;
    }
    public User FindOldUser(String username){
        try{
            f = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\Exam1\\" + username + ".txt");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;
            name = reader.readLine();
            cash = Integer.parseInt(reader.readLine());
        }
        catch (Exception e){}
        return this;
    }
    public User setNewUser(String hopeful)
    throws Exception{
        f = new File("C:\\Users\\Justin\\Documents\\GitHub\\CS372\\Exam1\\" + hopeful + ".txt");
        if (f.exists()){
            throw new Exception();
        }
        else{
            updateUser();
        }
        return this;
    }
    public void updateCash(int Cash){
        cash += Cash;
        updateUser();
    }
    public int getCash(){
        return cash;
    }
    public void updateUser(){
        try{
            BufferedWriter updater = new BufferedWriter(new FileWriter(f));
            updater.write(name);
            updater.newLine();
            updater.write(cash);
        }
        catch (Exception e){}
    }
}
