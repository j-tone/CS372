/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_1;
import java.util.ArrayList;
/**
 *
 * @author Justin
 */
public class PR2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++){
            gerbilList.add(new Gerbil(i));
            gerbilList.get(i).hop();
        }
        
    }
    
}
