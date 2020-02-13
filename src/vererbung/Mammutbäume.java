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
public class Mammutbäume extends Dschungel {
    
    public Mammutbäume(String Bäumeart, int Bäumeanzahl, String derMammutbaum) {
        super("Mammutbäume", Bäumeanzahl, derMammutbaum);
    }
    
void Abholzen() {
   System.out.println("Vorsicht Kollege der Baum fällt");
}
    
}
