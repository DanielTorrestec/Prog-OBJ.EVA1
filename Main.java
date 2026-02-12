package com.mycompany.practica8;

public class Main {
    public static void main(String[] args) {
        
        Productos p1 = new Productos("Trigo", "AgroNorte", "Tonelada", 4500.50, 10);

        Productos p2 = new Productos(); 
        p2.setNombre("Zanahoria");
        p2.setMarca("Huerta Fresca");
        p2.setUnidad("Kg");
        p2.setPrecio(18.90);
        p2.setCantidad(50.5);

        Productos p3 = new Productos("Patatas", "Tierra Santa", "Costal 25kg", 300.00, 20);

        System.out.println("--- INVENTARIO ---");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        p3.setPrecio(280.00);
        System.out.println("Nuevo precio de Patatas: " + p3.getPrecio());
    }
}