package br.com.curso.coordenador;

import br.com.curso.alunos.ValidationException;
import br.com.curso.usuarios.Usuario;
import br.com.curso.usuarios.UsuarioAutorizavel;

import java.util.Arrays;
import java.util.List;

public class Coordenador extends UsuarioAutorizavel /*implements UsuarioAutorizavel*/ {
    private long matricula;

    public Coordenador(String nome, String cpf, String login) throws ValidationException {
        super(nome, cpf, login);
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    @Override
    protected List<String> getAutorizacoes() {
        return Arrays.asList("COORD");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return false;
    }

    /* Interface desativada
   @Override
    public boolean temAutorizacao() {
        return true;
    }*/
}
