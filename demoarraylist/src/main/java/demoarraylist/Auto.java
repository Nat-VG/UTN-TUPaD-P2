/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoarraylist;

/**
 *
 * @author rogui
 */
public class Auto {
    private String patente;
    private String color;
    
// CONSTRUCTOR
    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }
    
@Override
public String toString() {
    return "Auto{" + "patente: " + patente + ", color: " + color + '}';
    
}


}
