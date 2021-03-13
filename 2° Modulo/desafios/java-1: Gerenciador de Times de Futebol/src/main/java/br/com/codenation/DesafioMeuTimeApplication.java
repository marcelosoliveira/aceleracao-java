package br.com.codenation;

import br.com.codenation.classes.Jogador;
import br.com.codenation.classes.Time;
import br.com.codenation.classes.repositorios.Repositorios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DesafioMeuTimeApplication implements MeuTimeInterface {

    Repositorios repositorios = new Repositorios();

    public void incluirTime(Long id, String nome, LocalDate dataCriacao,
        String corUniformePrincipal, String corUniformeSecundario) {

        if (repositorios.identificaIdTime(id)) {
            repositorios.addTime(new Time(id, nome, dataCriacao,
                corUniformePrincipal, corUniformeSecundario));
        }
    }

    public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento,
        Integer nivelHabilidade, BigDecimal salario) {

        if (repositorios.identificaIdJogador(id)) {
            repositorios.addJogador(new Jogador(id, idTime, nome,
                    dataNascimento, nivelHabilidade, salario));
        }
        repositorios.timeExist(idTime);
    }

    public void definirCapitao(Long idJogador) {
        repositorios.setCapitao(idJogador);
    }

    public Long buscarCapitaoDoTime(Long idTime) {
        repositorios.timeExist(idTime);
       return repositorios.capitaoTime(idTime);
    }

    public String buscarNomeJogador(Long idJogador) {
        return repositorios.jogadorNome(idJogador);
    }

    public String buscarNomeTime(Long idTime) {
        return repositorios.timeNome(idTime);
    }

    public List<Long> buscarJogadoresDoTime(Long idTime) {
        return repositorios.listJogadores(idTime);
    }

    public Long buscarMelhorJogadorDoTime(Long idTime) {
        return repositorios.jogadorMelhor(idTime);
    }

    public Long buscarJogadorMaisVelho(Long idTime) {
        return repositorios.jogadorMaisVelho(idTime);
    }

    public List<Time> buscarTimes() {
        return repositorios.timeBusca();
    }

    public Long buscarJogadorMaiorSalario(Long idTime) {
        return repositorios.maiorSalario(idTime);
    }

    public BigDecimal buscarSalarioDoJogador(Long idJogador) {
        return repositorios.buscaSalarioJogador(idJogador);
    }

    public List<Long> buscarTopJogadores(Integer top) {
       return repositorios.topJogadores(top);
    }

}
