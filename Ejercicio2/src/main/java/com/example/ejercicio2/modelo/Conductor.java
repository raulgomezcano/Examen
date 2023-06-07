package com.example.ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conductor {
    @Id
    @Column(length = 9, nullable = false)
    private String dni;
    @Column(length = 30, nullable = false)
    private String nombre;
    @OneToMany(mappedBy = "conductor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Visita> visitas;
}
