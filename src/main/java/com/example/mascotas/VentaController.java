package com.example.mascotas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class VentaController {
    
    private List<Venta> ventas = new ArrayList<>();
    public VentaController(){

        ventas.add(new Venta(1, "Pendiente", Arrays.asList(new Producto(1, "Collar",330.30),
        new Producto(2, "Huesito", 2000.98))));
        ventas.add(new Venta(2, "En camino", Arrays.asList(new Producto(2, "Huesito", 2000.98),
        new Producto(5,"Cuerda",400))));
        ventas.add(new Venta(3, "Entregado", Arrays.asList(new Producto(7, "Champu", 500.98),
        new Producto(10,"Cojin",3000))));
        ventas.add(new Venta(4, "Pendiente", Arrays.asList(new Producto(1, "Collar",330.30),
        new Producto(8, "Catnip", 800.25))));
        ventas.add(new Venta(5, "Pendiente", Arrays.asList(new Producto(9, "Arenero", 4000.00),
        new Producto(10,"Cojin",3000))));
    }


    @GetMapping("/Venta")
    public List<Venta> getAllVentas() {
        return ventas;
    }

    @GetMapping("/Venta/{idVenta}")
    public Venta getVentaById(@PathVariable int idVenta) {
        for(Venta item: ventas){
            if(item.getIdCompra() == idVenta){
                return item;
            }
        }
        
        return null;
    }

    @GetMapping("/EstadoOrdenes/{estado}")
    public List<Venta> getByEstadoOrden(@PathVariable String estado) {

        //Si no se crea la lista aqui se duplican los datos
        List<Venta> listaestado = new ArrayList<>();

        for(Venta item: ventas){
            if(item.getEstado().equals(estado)){
                listaestado.add(item);
            }
        }
        
        return listaestado;

    }
    
    
    

}