package com.devjun.spring.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjun.spring.biblioteca.entities.Emprestimo;
import com.devjun.spring.biblioteca.repositories.EmprestimoRepository;

@RestController
@RequestMapping(value = "/emprestimo")
public class EmprestimoController {
	
	@Autowired
	private EmprestimoRepository repository;
	
	@GetMapping
	public List<Emprestimo> findall(){
		List<Emprestimo> result = repository.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public Emprestimo findById(@PathVariable Long id) {
		Emprestimo result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Emprestimo insert(@RequestBody Emprestimo emprestimo) {
		Emprestimo result = repository.save(emprestimo);
		return result;
	}


}
