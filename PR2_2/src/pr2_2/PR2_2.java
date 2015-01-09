/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_2;
import pr2_1.Gerbil;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Justin
 */
public class PR2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<Gerbil>();
        for(int i = 0; i < 10; i++){
            gerbilList.add(new Gerbil(i));
        }
        
        Iterator<Gerbil> it = gerbilList.iterator();
        while(it.hasNext()){
            it.next().hop();
        }
    }
}
