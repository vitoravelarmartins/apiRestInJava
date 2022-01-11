package br.com.estudorest.estudorestapi.repository;

import br.com.estudorest.estudorestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {



}
