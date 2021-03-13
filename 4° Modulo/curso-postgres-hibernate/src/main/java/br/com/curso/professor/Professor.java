package br.com.curso.professor;

import br.com.curso.disciplinas.Disciplina;
import br.com.curso.usuarios.Usuario;
import br.com.curso.alunos.ValidationException;
import br.com.curso.usuarios.UsuarioAutorizavel;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "professor")
public class Professor extends UsuarioAutorizavel /*implements UsuarioAutorizavel */{

    @OneToMany(mappedBy = "professor")
    private List<Disciplina> disciplinas;

    public Professor(String nome, String cpf, String login) throws ValidationException {
        super(nome, cpf, login);
    }

    @Override
    protected List<String> getAutorizacoes() {
        return Arrays.asList("PROF");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return true;
    }

/*@Override
    public boolean temAutorizacao() {
        return true;
    }*/
}
