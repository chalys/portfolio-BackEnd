package com.portfolio.cral.Interface;

import com.portfolio.cral.Entity.Persona;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    
    public Persona findPersona(Long id);
}
