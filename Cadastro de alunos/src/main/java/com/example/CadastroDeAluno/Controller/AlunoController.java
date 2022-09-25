package com.example.CadastroDeAluno.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CadastroDeAluno.Model.AlunoModel;
import com.example.CadastroDeAluno.Repository.AlunoRepository;

@RestController
@RequestMapping("/api/Alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository AlunoRepository;

	@PostMapping
	public @ResponseBody AlunoModel novoAluno(@Valid AlunoModel Aluno) {
		AlunoRepository.save(Aluno); 
		return Aluno; 

	}
	
	@GetMapping
	public Iterable<AlunoModel> obterAlunos(){
		return AlunoRepository.findAll();
	}
	
	@PutMapping
	public AlunoModel alterarProduto(AlunoModel aluno) {
		AlunoRepository.save(aluno);
		return aluno;
	}
	
	@DeleteMapping("/{id}")
	public void excluirAluno(@PathVariable int id) {
		AlunoRepository.deleteById(id);
		
	}
	
}

