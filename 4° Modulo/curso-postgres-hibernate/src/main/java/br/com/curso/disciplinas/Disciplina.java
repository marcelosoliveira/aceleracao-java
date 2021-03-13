package br.com.curso.disciplinas;

import br.com.curso.alunos.Aluno;
import br.com.curso.alunos.ValidationException;
import br.com.curso.professor.Professor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    private Long id;

    private String nome;
    private String descricao;

    @ManyToMany
    @JoinTable(name = "disciplina_aluno", joinColumns =
            {@JoinColumn(name = "fk_disciplina_id")}, inverseJoinColumns =
            {@JoinColumn(name = "fk_aluno_id")})
    private List<Aluno> alunos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "fk_professor_id")
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
