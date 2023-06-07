package com.example.ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lugar {
    @Id
    @Column(length = 3, nullable = false)
    private Integer id_lugar;
    @Column(length = 30, nullable = false)
    private String nombre;
    @OneToMany(mappedBy = "lugar", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Visita> visitas;
}
