package br.com.estudorest.estudorestapi.controller;

import br.com.estudorest.estudorestapi.model.UsuarioModel;
import br.com.estudorest.estudorestapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;


    @GetMapping(path = "api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuarioModel) {
        return repository.save(usuarioModel);
    }


}
