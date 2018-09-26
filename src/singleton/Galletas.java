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
public class Galletas {
    private String galletita;
    //evitar que modifiquen el valor de galletita 
    private static Galletas harina;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Galletas(String galletita) {
        this.galletita = galletita;
        System.out.println("galleta en produccion: " + this.galletita);
    }

    //empieza el singleton
    public static Galletas getSingletonInstance(String galletita) {
        if (harina == null){
            harina = new Galletas(galletita);
        }
        else{
            System.out.println("No se puede hacer "+ galletita + " porque ya se produce otra galleta");
        }
        
        return harina;
    }
    // metodos getter y setter

    public String getGalletita() {
        return galletita;
    }

    public void setGalletita(String galletita) {
        this.galletita = galletita;
    }

    
    
}

