package com.example.ejercicio2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface IGenericRepo<T,ID> extends JpaRepository<T,ID> {
    @Override
    Optional<T> findById(ID id);
}
