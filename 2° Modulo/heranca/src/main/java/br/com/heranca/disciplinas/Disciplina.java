package br.com.heranca.disciplinas;

import br.com.heranca.alunos.Aluno;
import br.com.heranca.alunos.ValidationException;
import br.com.heranca.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;

    private List<Aluno> alunos = new ArrayList<>();

    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    private static final byte LIMITE = 10;

    public void matricular(Aluno aluno) throws ValidationException {
        if (this.alunos.size() < LIMITE) {
            alunos.add(aluno);
        } else {
            throw new ValidationException("Limite de alunos alcançado o limite é " + LIMITE);
        }
    }

    public void mostrarAlunos() {
        this.alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
    }
}
