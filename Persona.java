/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVA1_4_ENCAPSULAMIENTO;

/**
 *
 * @author chili
 */
public class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //constructores
    //comportamiento: // Interfaz
    // get y set
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getApellidos(){
        return apellidos;
        
    }
    public void setApellidos(String valor){
        apellidos = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
        public char getGenero(){
        return genero;
    }
    
    public void setGenero(char valor){
        genero = valor;
    }
}
