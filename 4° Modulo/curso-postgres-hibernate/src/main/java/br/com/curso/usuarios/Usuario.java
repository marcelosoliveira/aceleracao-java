package br.com.curso.usuarios;

import br.com.curso.alunos.ValidationException;
import br.com.curso.relatorios.Coluna;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String login;

    public Usuario(String nome, String cpf, String login) throws ValidationException {
        setNome(nome);
        setCpf(cpf);
        setLogin(login);
    }

    @Coluna(posicao = 1, titulo = "NOME")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Coluna(posicao = 2, titulo = "CPF")
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
        return !cpf.isEmpty() && cpf != null && cpf.length() == 14;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Login: " + this.login + " | CPF: " + this.cpf ;
    }
}