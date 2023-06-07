package com.softtek.ejercicio1.presentacion;

import com.softtek.ejercicio1.modelo.Factura;
import com.softtek.ejercicio1.modelo.Iimpuesto;
import com.softtek.ejercicio1.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Main {
    public static void main(String[] args){
        Producto producto1 = new Producto();
        producto1.setNombre("Cocacola");producto1.setPrecio(3);
        Producto producto2 = new Producto();
        producto2.setNombre("Fantas");producto2.setPrecio(5);
        Factura factura = new Factura();
        factura.anadirProducto(producto1); factura.anadirProducto(producto2);
        System.out.println("El impuesto añadido de la factura es: " + factura.calcularTotalFactura());
    }
}
