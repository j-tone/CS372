/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class CookieSales {
    private int totalCost;
    private int ThinMintCount;
    private int SamoaCount;
    private int ChocoChipCount;
    private final int ThinMintCost = 3;
    private final int SamoaCost = 4;
    private final int ChocoChipCost = 5;
    
    public CookieSales(){
        resetOrder();
    }
    
    public void addTM(){
        ThinMintCount++;
        totalCost += ThinMintCost;
    }
    public void addSM(){
        SamoaCount++;
        totalCost += SamoaCost;
    }
    public void addCC(){
        ChocoChipCount++;
        totalCost += ChocoChipCost;
    }
    
    public int getTotalSales(){
        return totalCost;
    }
    public int getTMCount(){
        return ThinMintCount;
    }
    public int getSMCount(){
        return SamoaCount;
    }
    public int getCCCount(){
        return ChocoChipCount;
    }
    
    public void resetOrder(){
        totalCost = 0;
        ThinMintCount = 0;
        SamoaCount = 0;
        ChocoChipCount = 0;
    }
    
}
