/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class UnderOverGame {
    private Die theDice = new Die();
    private int currentValue;
    private int CurrChoice;
    private int CurrBet;
    
    public UnderOverGame(){
        
    }
    public void setBet(int Bet){
        CurrBet = Bet;
    }
    public void setChoice(int choice){
        CurrChoice = choice;
    }
    
    public void PlayGame(User player){
        int cv = getCV();
        switch (CurrChoice){
            case 1:
                if (cv > 7)
                    player.updateCash(CurrBet);
                
                else
                    player.updateCash(-CurrBet);
                break;
            
            case 2:
                if (cv == 7)
                    player.updateCash(CurrBet*4);
                else
                    player.updateCash(-CurrBet*4);
                break;
            
            case 3:
                if (cv < 7)
                    player.updateCash(CurrBet);
                else
                    player.updateCash(-CurrBet);
                break;
            
            default:
                    
        };
        
    }
    public void roll(){
        int CurrentDie1 = theDice.roll();
        int CurrentDie2 = theDice.roll();
        currentValue = CurrentDie1 + CurrentDie2;
    }
    public int getCV(){
        return currentValue;
    }
}
