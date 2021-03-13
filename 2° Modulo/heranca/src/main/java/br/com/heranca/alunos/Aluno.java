package br.com.heranca.alunos;

import br.com.heranca.usuarios.Usuario;

public class Aluno extends Usuario {

    private Integer numeroMatricula;

    public Aluno(String nome, String cpf, String login) throws ValidationException {
        super(nome, cpf, login);
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}