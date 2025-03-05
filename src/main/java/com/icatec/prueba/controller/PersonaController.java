package com.icatec.prueba.controller;

import com.icatec.prueba.bean.Persona;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @GetMapping()
    public Persona getPersona(){
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEdad(20);
        return persona;
    }

    @PostMapping()
    public Persona savePersona(@RequestHeader("X-API-KEY") String apiKey, @RequestBody Persona persona){
        Persona newPersona = new Persona();
        newPersona.setId(persona.getId() + 1);
        newPersona.setNombre(persona.getNombre());
        newPersona.setApellido(persona.getApellido());
        newPersona.setEdad(persona.getEdad());
        newPersona.setApiKey(apiKey);
        return newPersona;
    }
}
