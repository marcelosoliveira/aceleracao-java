package br.com.curso.usuarios;

import br.com.curso.alunos.ValidationException;

import java.util.List;

public abstract class UsuarioAutorizavel extends Usuario {
    public UsuarioAutorizavel(String nome, String cpf, String login) throws ValidationException {
        super(nome, cpf, login);
    }

    public boolean temAutorizacao() {
        List<String> autorizacoes = getAutorizacoes();
        return autorizacoes.contains("ADMIN") || verificarAutorizacaoLogin();
    }

    protected abstract List<String> getAutorizacoes();

    protected abstract boolean verificarAutorizacaoLogin();
}
