package com.example.ejercicio2.repositorio;

import java.util.List;

public interface ICrud <T,ID>{
    List<T> listAll();
    T findObject(ID id);
    T insertObject(T object);
    T updateObject(T object, ID id);
}
