package com.example.ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "autobus")
public class Autobus {
    @Id
    @Column(length = 30, nullable = false)
    private String matricula;
    @Column(length = 4, nullable = false)
    private Integer a_fabricacion;
    @OneToMany(mappedBy = "autobus", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Visita> visitas;
}
