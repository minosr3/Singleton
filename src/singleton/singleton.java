/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author overkill
 */
public class singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Galletas saltina = Galletas.getSingletonInstance("saltina");
      //llamar el singleton
        Galletas Ducales = Galletas.getSingletonInstance("Ducales");
        
        // Saltina y noel son referencias a un único objeto de la clase galletita
        System.out.println(Ducales.getGalletita());
        System.out.println(saltina.getGalletita());
    }
    
}
