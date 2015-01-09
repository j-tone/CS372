/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_3;
import pr2_1.Gerbil;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author Justin
 */
public class PR2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap gerbilCage = new HashMap();
        for (int i = 0; i < 10; i++){
            gerbilCage.put(String.format("Mr. Gerbil the %d", i), new Gerbil(i));
        }
       Iterator<String> it = gerbilCage.keySet().iterator();
       while(it.hasNext()){
           String key = it.next();
           System.out.printf("%s is the Gerbil's name. ", key);
           Gerbil currentGerbil = (Gerbil) gerbilCage.get(key);
           currentGerbil.hop();
       }
       
    }
    
}
