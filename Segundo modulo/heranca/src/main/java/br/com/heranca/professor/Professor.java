package br.com.heranca.professor;

import br.com.heranca.usuarios.Usuario;
import br.com.heranca.alunos.ValidationException;

public class Professor extends Usuario {

    public Professor(String nome, String cpf, String login) throws ValidationException {
        super(nome, cpf, login);
    }
}
