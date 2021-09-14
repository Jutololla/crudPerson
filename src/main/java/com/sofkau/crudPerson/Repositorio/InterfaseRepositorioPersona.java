package com.sofkau.crudPerson.Repositorio;

import com.sofkau.crudPerson.Entiedades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaseRepositorioPersona extends CrudRepository<Persona, Integer> {
}
