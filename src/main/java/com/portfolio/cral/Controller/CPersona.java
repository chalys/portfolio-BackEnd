package com.portfolio.cral.Controller;

import com.portfolio.cral.Dto.dtoPersona;
import com.portfolio.cral.Entity.Persona;
import com.portfolio.cral.Security.Controller.Mensaje;
import com.portfolio.cral.Service.SPersona;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = {"https://frontendcral.web.app"})
public class CPersona {

    @Autowired
    SPersona sPersona;

    @GetMapping("/list")
    public ResponseEntity<List<Persona>> list() {
        List<Persona> list = sPersona.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id) {
        if (!sPersona.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = sPersona.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<?> create(@RequestBody dtoPersona dtopers) {
        if (StringUtils.isBlank(dtopers.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sPersona.existsByNombre(dtopers.getNombre())) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = new Persona(
                dtopers.getNombre(), dtopers.getApellido(), dtopers.getProfesion(), dtopers.getDescripcion(), dtopers.getPais(),
                dtopers.getFecha_nacimiento(), dtopers.getTelefono(), dtopers.getFoto_perfil_url());
        sPersona.save(persona);
        return new ResponseEntity(new Mensaje("Persona agregada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopers) {
        if (!sPersona.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if (sPersona.existsByNombre(dtopers.getNombre()) && sPersona.getByNombre(dtopers.getNombre()).get().getIdpersona() != id) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtopers.getNombre())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Persona persona = sPersona.getOne(id).get();

        persona.setNombre(dtopers.getNombre());
        persona.setApellido(dtopers.getApellido());
        persona.setProfesion(dtopers.getProfesion());
        persona.setDescripcion(dtopers.getDescripcion());
        persona.setPais(dtopers.getPais());
        persona.setFecha_nacimiento(dtopers.getFecha_nacimiento());
        persona.setTelefono(dtopers.getTelefono());
        persona.setFoto_perfil_url(dtopers.getFoto_perfil_url());

        sPersona.save(persona);

        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);
    }

}
