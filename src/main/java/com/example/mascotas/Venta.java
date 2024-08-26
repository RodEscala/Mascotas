package com.example.mascotas;

import java.util.List;

public class Venta {

    private int idCompra;
    private String estado;
    private List<Producto> listaProducto;
    

    public Venta(int idCompra,String estado,List<Producto> listaProducto){
        this.idCompra = idCompra;
        this.estado = estado;
        this.listaProducto = listaProducto;
        
    }

    public int getIdCompra(){
        return idCompra;
    }

    public String getEstado(){
        return estado;
    }

    public List<Producto> getListaProductos(){
        return listaProducto;
    }
    
    
}
