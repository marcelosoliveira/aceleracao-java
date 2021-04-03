package com.acceleracao.oauth2.controller;

import com.acceleracao.oauth2.model.Usuario;
import com.acceleracao.oauth2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
        return this.usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> buscarTodos() {
        Iterable<Usuario> todos = this.usuarioRepository.findAll();
        return toList(todos);
    }

    public <E> List<E> toList(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }
}
