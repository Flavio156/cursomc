package com.flavio.cursomc.cursomc.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flavio.cursomc.cursomc.domain.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    
}
