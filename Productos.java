package com.mycompany.practica8;

public class Productos {

    private String nombre;
    private String marca;
    private String unidad;
    private double precio;
    private double cantidad;

    public Productos() {
    }

    public Productos(String nombre, String marca, String unidad, double precio, double cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.unidad = unidad;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getUnidad() {
        return unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Producto: " + nombre + " | Marca: " + marca + " | Precio: $" + precio + " x " + unidad + " | Stock: " + cantidad;
    }
}