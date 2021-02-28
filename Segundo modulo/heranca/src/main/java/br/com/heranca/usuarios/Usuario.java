package br.com.heranca.usuarios;

import br.com.heranca.alunos.ValidationException;

public class Usuario {
    private String nome;

    private String cpf;

    private String login;

    public Usuario(String nome, String cpf, String login) throws ValidationException {
        setNome(nome);
        setCpf(cpf);
        setLogin(login);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws ValidationException {
        if (validateCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new ValidationException("CPF Inválido");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws ValidationException {
        if (validateLogin(login)) {
            this.login = login;
        } else {
            throw new ValidationException("Login Inválido");
        }

    }

    private boolean validateLogin(String login) {
        return !login.isEmpty() && login != null && login.length() < 20;
    }

    private boolean validateCpf(String cpf) {
        return !cpf.isEmpty() && cpf != null && cpf.length() == 11;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Login: " + this.login + " | CPF: " + this.cpf ;
    }
}