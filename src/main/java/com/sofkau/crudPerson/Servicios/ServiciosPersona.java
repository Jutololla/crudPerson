package com.sofkau.crudPerson.Servicios;

import com.sofkau.crudPerson.Entiedades.Persona;
import com.sofkau.crudPerson.Repositorio.InterfaseRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosPersona implements InterfazServiciosPersona{

    @Autowired
    private InterfaseRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
