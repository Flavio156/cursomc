package com.flavio.cursomc.cursomc.services;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavio.cursomc.cursomc.domain.Categoria;
import com.flavio.cursomc.cursomc.repositores.CategoriaRepository;
import com.flavio.cursomc.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;
    
    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

   
    }


    

