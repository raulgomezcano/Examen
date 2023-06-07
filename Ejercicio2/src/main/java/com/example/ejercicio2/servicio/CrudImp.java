package com.example.ejercicio2.servicio;

import com.example.ejercicio2.repositorio.IGenericRepo;

import java.util.List;

public abstract class CrudImp<T,ID> {
    protected abstract IGenericRepo<T,ID> getRepo();

    public List<T> listAll(){
        return getRepo().findAll();
    }

    public T findObject(ID id){
        return getRepo().findById(id).orElse(null);
    }

    public T insertObject(T object){
        getRepo().save(object);
        return object;
    }

    public T updateObject(T object, ID id){
        T obEdit = getRepo().findById(id).orElse(null);
        getRepo().save(object);
        return object;
    }
}
