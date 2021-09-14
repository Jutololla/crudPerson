package com.sofkau.crudPerson.Controlador;

import com.sofkau.crudPerson.Entiedades.Persona;
import com.sofkau.crudPerson.Servicios.InterfazServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfazServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> listarPersonas(){
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }

    @PutMapping(value="/editarPersona")
    public Persona editarPersona(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }

    @DeleteMapping(value="/delete/{id}")
    public void eliminarPersona(@PathVariable int id){
        servicio.borrar(id);
    }
}
