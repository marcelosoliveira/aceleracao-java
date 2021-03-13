package br.com.curso.alunos;

import br.com.curso.disciplinas.Disciplina;
import br.com.curso.usuarios.Usuario;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno extends Usuario /*implements UsuarioAutorizavel*/ {

    private Integer numeroMatricula;

    @ManyToMany
    @JoinTable(name = "disciplina_aluno", joinColumns =
            {@JoinColumn(name = "fk_aluno_id")}, inverseJoinColumns =
            {@JoinColumn(name = "fk_discilpina_id")})
    private List<Disciplina> disciplinas;

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