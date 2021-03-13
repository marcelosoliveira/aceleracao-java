package br.com.heranca;

import br.com.heranca.alunos.Aluno;
import br.com.heranca.alunos.ValidationException;
import br.com.heranca.disciplinas.Disciplina;
import br.com.heranca.professor.Professor;
import br.com.heranca.usuarios.Usuario;
import br.com.heranca.usuarios.repositorios.RepositorioUsuario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ValidationException {
        RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
        try {
            Professor professor = new Professor("Diego Fernandes", "12345678909", "rocketseat");
            Aluno aluno = new Aluno("Marcelo Santos", "09876543212", "msbobsk8");
            Disciplina disciplina = new Disciplina("React Native", professor);
            disciplina.matricular(new Aluno("Marcelo", "12345678909", "msbobsk8"));
            disciplina.mostrarAlunos();

            repositorioUsuario.add(professor);
            repositorioUsuario.add(aluno);
           // repositorioUsuario.findAll().stream().forEach(System.out::println);
            System.out.println(repositorioUsuario.search("09876543212"));
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

    }
}
