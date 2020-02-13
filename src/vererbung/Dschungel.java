/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbung;

/**
 *
 * @author hss-6808
 */
public class Dschungel extends Waelder {
    
    String Mammutbäume;
    
    Dschungel(String Bäumeart, int Bäumeanzahl, String derMammutbaum) {
        super(Bäumeart,Bäumeanzahl);
        this.Mammutbäume= derMammutbaum;
        
       
    }
    
    void Abholzen() {
    System.out.println("Deine Mudda holzt den Dschungel ab alda");
}
    
}
