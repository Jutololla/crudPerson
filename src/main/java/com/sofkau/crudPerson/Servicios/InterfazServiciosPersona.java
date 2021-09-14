package com.sofkau.crudPerson.Servicios;

import com.sofkau.crudPerson.Entiedades.Persona;

import java.util.List;

public interface InterfazServiciosPersona {

    public List<Persona> listar();
    public Persona listarId(int id);
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);
}
