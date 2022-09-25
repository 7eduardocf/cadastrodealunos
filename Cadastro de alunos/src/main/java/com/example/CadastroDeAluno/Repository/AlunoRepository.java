package com.example.CadastroDeAluno.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.CadastroDeAluno.Model.AlunoModel;

public interface AlunoRepository extends CrudRepository<AlunoModel, Integer>{

}
