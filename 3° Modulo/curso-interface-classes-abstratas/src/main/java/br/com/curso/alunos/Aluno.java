package br.com.curso.alunos;

import br.com.curso.usuarios.Usuario;

public class Aluno extends Usuario /*implements UsuarioAutorizavel*/ {

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

    /* @Override
    public boolean temAutorizacao() {
        return false;
    }*/
}