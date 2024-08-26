package com.example.mascotas;

public class Producto {
        private int idProducto;
        private String nombre;
        private double valor;

    public Producto(int idProducto,String nombre, double valor){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getIdProducto(){
        return idProducto;
    }

    public String getNombre(){
        return nombre;
    }

    public double getValor(){
        return valor;
    }

    
}
