/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedWriter;
import java.io.BufferedReader;

/**
 *
 * @author Justin
 */
public class UnderOverGame {
    private User CurrentUser = new User();
    private Die theDice;
    private int currentValue;
    private int CurrChoice;
    private int CurrBet;
    
    public UnderOverGame(){
        
    }
    public void DeclareNewUser(String username){
        try{
        CurrentUser.setNewUser(username);
        }
        catch(Exception e){}
    }
    public void DeclareOldUser(String username){
        try{
        CurrentUser.FindOldUser(username);
        }
        catch(Exception e){}
    }
    public void setBet(int Bet){
        CurrBet = Bet;
    }
    public void setChoice(int choice){
        CurrChoice = choice;
    }
    public int getUserCash(){
        return CurrentUser.getCash();
    }
    public void PlayGame(){
        int cv = getCV();
        switch (CurrChoice){
            case 1:{
                if (cv > 7)
                    CurrentUser.updateCash(CurrBet);
                else
                    CurrentUser.updateCash(-CurrBet);
            }
            case 2:{
                if (cv == 7)
                    CurrentUser.updateCash(CurrBet);
                else
                    CurrentUser.updateCash(-CurrBet);
            }
            case 3:{
                if (cv < 7)
                    CurrentUser.updateCash(CurrBet);
                else
                    CurrentUser.updateCash(-CurrBet);
            }
            default:
                    
        }
        
    }
    public void rollforCV(){
        int CurrentDie1 = theDice.roll();
        int CurrentDie2 = theDice.roll();
        currentValue = CurrentDie1 + CurrentDie2;
    }
    public int getCV(){
        return currentValue;
    }
    public void UpdateProgress(){
        
    }
}
