package com.softtek.ejercicio1.modelo;

import org.springframework.stereotype.Component;

@Component("reducido")
public class IvaSuperReducido implements Iimpuesto{
    private double ivaReducido = 0.04;
    @Override
    public double calcularImpuesto(Producto p1){
        return p1.precio*ivaReducido;
    }
}
