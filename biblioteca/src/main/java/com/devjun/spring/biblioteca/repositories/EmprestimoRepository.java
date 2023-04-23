package com.devjun.spring.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devjun.spring.biblioteca.entities.Emprestimo;


public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

}
