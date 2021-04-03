package com.acceleracao.oauth2.repository;

import com.acceleracao.oauth2.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}
