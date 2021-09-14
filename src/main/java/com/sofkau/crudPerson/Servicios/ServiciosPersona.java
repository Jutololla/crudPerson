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

    }

    @Override
    public Persona actualizar(Persona persona) {
        Optional<Persona> auxPersona = data.findById(persona.getId());
        if(auxPersona.isEmpty()){
            throw new NoSuchElementException("El elemento a editar no existe en la base de datos");
        }
        else{
            return data.save(persona);
        }
//        return auxPersona.map(Persona ->{
//            persona.setId(persona.getId());
//            persona.setNombre(persona.getNombre());
//            persona.setEdad(persona.getEdad());
//            return data.save(persona);
//        }).get();
    }
}
