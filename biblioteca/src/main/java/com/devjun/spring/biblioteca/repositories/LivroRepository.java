package com.devjun.spring.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjun.spring.biblioteca.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
