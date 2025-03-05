package com.icatec.prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

    @GetMapping
    public String holaMundo(){
        return "Hola Mundo";
    }
}
