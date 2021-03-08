package br.com.curso.diretor;

import br.com.curso.alunos.ValidationException;
import br.com.curso.relatorios.Coluna;
import br.com.curso.usuarios.Usuario;
import br.com.curso.usuarios.UsuarioAutorizavel;

import java.util.Arrays;
import java.util.List;

public class Diretor extends UsuarioAutorizavel {
    private String dataCargo;

    public Diretor(String nome, String cpf, String login) throws ValidationException {
        super(nome, cpf, login);
    }

    @Override
    protected List<String> getAutorizacoes() {
        return Arrays.asList("ADMIN");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return true;
    }

    @Coluna(posicao = 3, titulo = "Data do Cargo")
    public String getDataCargo() {
        return dataCargo;
    }

    public void setDataCargo(String dataCargo) {
        this.dataCargo = dataCargo;
    }
}
