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
        //Constructor
        Principal pObjPpal = new Principal();
        Prueba pObjPrue = new Prueba ();
        System.out.println(pObjPrue.X);
        
    }
    
}
class Prueba{
int X;
    public Prueba() {
        X = 100;
    }
    
}