package br.com.curso;

import br.com.curso.alunos.ValidationException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) throws ValidationException {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("curso");
        factory.close();
    }
}
