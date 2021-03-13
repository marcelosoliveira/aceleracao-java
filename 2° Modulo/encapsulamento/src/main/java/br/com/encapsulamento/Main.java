package br.com.encapsulamento;

import br.com.encapsulamento.aluno.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("", "", "");

        aluno.setLogin("Marcelo");
        aluno.setNome("Marcelo");
        System.out.println(aluno.getLogin());

        aluno.setCpf("12345678910");
        System.out.println(aluno.getCpf());

        System.out.println(aluno);

    }
}
