package com.devjun.spring.biblioteca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table (name = "tb_emprestimo")
public class Emprestimo {

	
	@ManyToOne
	@JoinColumn(name = "aluno_matricula")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "livro_id")
	private Livro livro;
	
	@Id
	private String data_emprestimo;
//False = devolvido True = Emprestado
	private boolean status;
	



	public Emprestimo() {
		
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
