package br.com.curso;

import br.com.curso.alunos.Aluno;
import br.com.curso.alunos.ValidationException;
import br.com.curso.coordenador.Coordenador;
import br.com.curso.credito.AnalisadorCredito;
import br.com.curso.credito.externo.Pessoa;
import br.com.curso.diretor.Diretor;
import br.com.curso.disciplinas.Disciplina;
import br.com.curso.lancadornotas.LancadorNotas;
import br.com.curso.professor.Professor;
import br.com.curso.relatorios.GeradorRelatorios;
import br.com.curso.usuarios.Usuario;
import br.com.curso.usuarios.UsuarioAutorizavel;
import br.com.curso.usuarios.repositorios.RepositorioUsuario;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ValidationException {
      /*  RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
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
        System.out.println("\n Professor vai lançar notas no sistema?");
        UsuarioAutorizavel usuarioProfessor = new Coordenador("Diego Fernandes",
                "12345678909", "rocketseat");
        new LancadorNotas().login(usuarioProfessor);
        System.out.println("\n");
        System.out.println("Aluno vai lançar notas no sistema?");
        UsuarioAutorizavel usuarioAluno = new Aluno("Marcelo Santos",
                "09876543212", "msbobsk8");
        new LancadorNotas().login(usuarioAluno);*/

       /* Pessoa pessoa = getPessoa();

        AnalisadorCredito analisador = new AnalisadorCredito();

        boolean resultado = analisador.analisarCredito(pessoa);

        if (resultado) {
            System.out.println("Crédito Aprovado.");
        } else {
            System.out.println("Crédito Reprovado!");
        }*/

       /* Arrays.stream(Pessoa.class.getDeclaredMethods()).forEach(method ->  System.out.println(method.getName()));
        System.out.println('\n');
        Arrays.stream(Pessoa.class.getDeclaredFields()).forEach(field ->  System.out.println(field.getName()));
        System.out.println('\n');

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa Test");
        try {
            Field nome = Pessoa.class.getDeclaredField("nome");
            nome.setAccessible(true);
            nome.set(pessoa, "Mudei o valor");
        } catch (NoSuchFieldException e) {
            System.out.println("Atributo não encontrado!");
        } catch (IllegalAccessException i) {
            System.out.println("Não tem acesso!");
        }
        System.out.println(pessoa.getNome());*/

        GeradorRelatorios gerador = new GeradorRelatorios();
        Diretor usuario1 = new Diretor("Nome do aluno1", "191.000.000-00", "login1");
        usuario1.setDataCargo("09/07/2014");
        Diretor usuario2 = new Diretor("Nome do aluno2", "192.000.000-00", "login2");
        usuario2.setDataCargo("07/09/2017");
        Diretor usuario3= new Diretor("Nome do aluno3", "193.000.000-00", "login3");
        usuario3.setDataCargo("03/11/2019");

        List<Object> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        gerador.gerarRelatorio(usuarios, 3);

    }

    public static Pessoa getPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa test");
        pessoa.setCpf("191.000.000-00");
        pessoa.getQtdChequesDesvolvidos(0);
        pessoa.getScoreSerasa(500);
        pessoa.getScoreSpc(500);
        pessoa.setValorDivida(1001);
        return pessoa;
    }
}
