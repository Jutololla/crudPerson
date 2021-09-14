package com.sofkau.crudPerson.Servicios;

import com.sofkau.crudPerson.Entiedades.Persona;
import com.sofkau.crudPerson.Repositorio.InterfaseRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
        Optional<Persona> auxPersona = data.findById(id);
        if(auxPersona.isEmpty()){
            throw new NoSuchElementException("El elemento a eliminar no existe en la base de datos");
        }
        data.deleteById(id);
    }

    @Override
    public Persona actualizar(Persona persona) {
        Optional<Persona> auxPersona = data.findById(persona.getId());
        if(auxPersona.isEmpty()){
            throw new NoSuchElementException("El elemento a editar no existe en la base de datos");
        }
        return data.save(persona);
            }
}
