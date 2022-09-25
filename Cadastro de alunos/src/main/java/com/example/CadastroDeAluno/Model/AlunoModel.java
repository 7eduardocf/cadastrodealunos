package com.example.CadastroDeAluno.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Tabelo_Aluno")
public class AlunoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String nome;
	
	private String Matricula;
	@NotBlank
	private String Cpf;
	
	public AlunoModel() {
		super();
	}

	public AlunoModel(String nome, String Matricula) {
		super();
		this.nome = nome;
		this.Matricula = Matricula;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String Matricula) {
		this.Matricula = Matricula;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	
	
	
}
