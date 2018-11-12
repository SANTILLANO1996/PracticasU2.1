
import Televisor.Televisor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Fernando Martínez Santillano #18550371
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor bTV = new Televisor();
        
        for (int i = 0; i < 100; i++) {
            System.out.println(bTV.volumen);
        }
       
        System.out.println("Numero del canal");
        int bTele = bTV.setCanal(0);
       
    }
    
}
