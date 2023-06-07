package com.softtek.ejercicio1.modelo;

import org.springframework.stereotype.Component;

@Component("general")
public class IvaGeneral implements Iimpuesto{
    public double ivaGeneral = 21;
    @Override
    public double calcularImpuesto(Producto p1){
        return p1.precio*ivaGeneral;
    }
}
