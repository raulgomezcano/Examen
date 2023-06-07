package com.example.ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visita {
    @Id
    @Column(length = 30, nullable = false)
    private Integer id;
    @Column(length = 30, nullable = false)
    private Date f_visita;
    @JoinColumn(name = "autobus")
    private Autobus autobus;
    @JoinColumn(name = "conductor")
    private Conductor conductor;
    @JoinColumn(name = "lugar")
    private Lugar lugar;

}
