package com.flavio.cursomc.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")

public class CategroiaResource {

    @RequestMapping(method=RequestMethod.GET)
    public String listar() {
        return "REST está funcionando";
    }   

}
