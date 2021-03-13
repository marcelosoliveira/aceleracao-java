package br.com.curso.professor;

import br.com.curso.usuarios.Usuario;
import br.com.curso.alunos.ValidationException;
import br.com.curso.usuarios.UsuarioAutorizavel;

import java.util.Arrays;
import java.util.List;

public class Professor extends UsuarioAutorizavel /*implements UsuarioAutorizavel */{

    public Professor(String nome, String cpf, String login) throws ValidationException {
        super(nome, cpf, login);
    }

    @Override
    protected List<String> getAutorizacoes() {
        return Arrays.asList("PROF");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return true;
    }

/*@Override
    public boolean temAutorizacao() {
        return true;
    }*/
}
