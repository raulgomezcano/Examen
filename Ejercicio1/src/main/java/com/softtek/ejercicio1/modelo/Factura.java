package com.softtek.ejercicio1.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Factura {
    @Autowired
    @Qualifier("general")
    private Iimpuesto impuesto;
    @Autowired
    private IvaGeneral general;
    private List<Producto> productos = new ArrayList<Producto>(10);
    private double sumadorPrecioProductos=0;
    private double totalFactura=0;

    private Producto producto1 = new Producto();

    private Producto producto2 = new Producto();

    public void anadirProducto(Producto p){
        productos.add(p);
    }
    public double calcularTotalFactura(){
        List<Double> lista = productos.stream()
                        .map(producto -> producto.getPrecio())
                                .collect(Collectors.toList());

        for(int i=0; i<lista.size(); i++){
            System.out.println("Precio de producto " + (i+1) +" : " + lista.get(i));
            sumadorPrecioProductos = sumadorPrecioProductos + lista.get(i);
        }
        System.out.println("--------------------------------");
        totalFactura = sumadorPrecioProductos * general.ivaGeneral;
        return totalFactura;
    }
}
