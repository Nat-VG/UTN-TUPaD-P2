/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoarraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Concesionaria {
    
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre, Collection<Auto> autos) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
        
    }

    Concesionaria(String fakeCar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList getAutos() {
        return autos;
    }
    
    public void mostrarAutos() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
         } else {
            for (int i = 0; i < autos.size();  i++) {
                System.out.println(autos.get(i));
                   }
            }
        }
    }
   