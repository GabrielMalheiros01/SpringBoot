package com.devjun.spring.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devjun.spring.biblioteca.entities.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
