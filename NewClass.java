/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVA1_4_ENCAPSULAMIENTO;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author chili
 */
public class NewClass {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.setNombre("Sarah");
        person.setApellidos("Torres");
        person.setEdad(18);
        person.setGenero('M');
        
        
        System.out.println("Nombre: " + person.getNombre());
        System.out.println("Apellidos: " + person.getApellidos());
        System.out.println("Edad: " + person.getEdad());
        System.out.println("Genero: " + person.getGenero());
        
        
        
    }
      
    
}
