package br.com.oobjeto.aluno;

public class Aluno {

    private String login;

    private String cpf;

    private String nome;

    public Aluno(String login, String cpf, String nome) {
        if (validateLogin(login)) {
            System.out.println("Login Válido!");
            this.login = login;
        } else {
            System.out.println("Login Inválido!");
        }
        this.login = login;
        this.cpf = cpf;
        this.nome = nome;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome + ", CPF: " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (validateLogin(login)) {
            System.out.println("Login Válido!");
            this.login = login;
        } else {
            System.out.println("Login Inválido!");
        }

    }

    private boolean validateLogin(String login) {
        return !login.isEmpty() && login.length() <= 20 && login != null;
    }
}
