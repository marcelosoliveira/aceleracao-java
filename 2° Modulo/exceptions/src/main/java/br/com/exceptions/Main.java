package br.com.exceptions;

import br.com.exceptions.aluno.Aluno;
import br.com.exceptions.aluno.ValidationException;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = null;
        try {
            aluno = new Aluno("Marcelo", "12345678909", "Teste Marcelo");
        } catch (ValidationException e) {
            System.out.println("message: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(aluno == null ? "" : aluno);
    }
}
