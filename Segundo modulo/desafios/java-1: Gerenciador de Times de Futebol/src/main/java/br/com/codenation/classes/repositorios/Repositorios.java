package br.com.codenation.classes.repositorios;

import br.com.codenation.classes.Jogador;
import br.com.codenation.classes.Time;
import br.com.codenation.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Repositorios<decimal> {

    private List<Time> times = new ArrayList<>();
    private List<Jogador> jogadores = new ArrayList<>();
    private List<Long> listJogadoresId = new ArrayList<>();
    private List<Long> topJogador = new ArrayList<>();
    private List<Long> idTimes = new ArrayList<>();
    private Long capitao;
    private Long auxiliarResponseLong;
    private String auxiliarResponseString;
    private double auxiliarMaior;
    private int auxiliarResponseInt;
    private double auxiliarMaiorDouble;

    public Long getCapitao() {
        return capitao;
    }

    public void setCapitao(Long capitao) throws JogadorNaoEncontradoException {
        for (Jogador jogador : findAllJogador()) {
            if (jogador.getId().equals(capitao)) {
                this.capitao = capitao;
            }
        }
        if (getCapitao() == null)
            throw new JogadorNaoEncontradoException("Jogador não encontrado");
    }

    public void addTime(Time time) {
        this.times.add(time);
    }

    public void addJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public List<Time> findAllTime() {
        return this.times;
    }

    public List<Jogador> findAllJogador() {
        return this.jogadores;
    }

    public boolean identificaIdTime(Long id) throws IdentificadorUtilizadoException {
        for (Time time : times) {
            if (time.getId().equals(id)) {
                throw new IdentificadorUtilizadoException("O Time já existe!");
            }
        }
        return true;
    }

    public boolean identificaIdJogador(Long id) throws IdentificadorUtilizadoException {
        for (Jogador jogador : jogadores) {
            if (jogador.getId().equals(id)) {
                throw new IdentificadorUtilizadoException("O Jogador já existe!");
            }
        }
        return true;
    }

    public void timeExist(Long idTime) throws TimeNaoEncontradoException {
        auxiliarResponseLong = null;
        for (Time time : times) {
            if (time.getId().equals(idTime)) {
                ;
                auxiliarResponseLong = idTime;
            }
        }
        if (auxiliarResponseLong == null) {
            throw new TimeNaoEncontradoException("O time não existe");
        }
    }

    public Long capitaoTime(Long idTime) throws CapitaoNaoInformadoException {
        auxiliarResponseLong = null;
        for (Jogador jogador : jogadores) {
            if (jogador.getId().equals(getCapitao())
                    && jogador.getIdTime().equals(idTime)) {
                auxiliarResponseLong = getCapitao();
            }
        }
        if (auxiliarResponseLong == null) {
            throw new CapitaoNaoInformadoException("Capitão não informado");
        }
        return auxiliarResponseLong;
    }

    public String jogadorNome(Long idJogador) throws JogadorNaoEncontradoException {
        for (Jogador jogador : jogadores) {
            if (jogador.getId().equals(idJogador)) {
                auxiliarResponseString = jogador.getNome();
            }
        }
        if (auxiliarResponseString == null) {
            throw new JogadorNaoEncontradoException("Jogador não encontrado");
        }
        return auxiliarResponseString;
    }

    public String timeNome(Long idTime) throws TimeNaoEncontradoException {
        for (Time time : times) {
            if (time.getId().equals(idTime)) {
                auxiliarResponseString = time.getNome();
            }
        }
        if (auxiliarResponseString == null) {
            throw new TimeNaoEncontradoException("O Time não existe");
        }
        return auxiliarResponseString;
    }

    public List<Long> listJogadores(Long idTime) throws TimeNaoEncontradoException {
        auxiliarResponseLong = null;
        for (Jogador jogador : jogadores) {
            if (jogador.getIdTime().equals(idTime)) {
                listJogadoresId.add(jogador.getId());
                auxiliarResponseLong = idTime;
            }
        }
        if (auxiliarResponseLong == null) {
            throw new TimeNaoEncontradoException("O Time não existe");
        }
        Collections.sort(listJogadoresId);
        return listJogadoresId;
    }

    public Long jogadorMelhor(Long idTime) throws TimeNaoEncontradoException {
        auxiliarResponseLong = null;
        auxiliarMaior = 0;
        for (Jogador jogador : jogadores) {
            if (jogador.getIdTime().equals(idTime)) {
                if (jogador.getNivelHabilidade() > auxiliarMaior)
                    auxiliarMaior = jogador.getNivelHabilidade();
            }
        }
        jogadores.stream().forEach(jogador -> {
            if (auxiliarMaior == jogador.getNivelHabilidade()) {
                auxiliarResponseLong = jogador.getId();
            }
        });
        if (auxiliarResponseLong == null) {
            throw new TimeNaoEncontradoException("O Time não existe");
        }
        return auxiliarResponseLong;
    }

    public Long jogadorMaisVelho(Long idTime) throws TimeNaoEncontradoException {
        auxiliarResponseLong = null;
        auxiliarMaior = 0;
        for (Jogador jogador : jogadores) {
            auxiliarResponseInt = (LocalDate.now().getYear() - jogador.getDataNascimento().getYear());
            if (jogador.getIdTime().equals(idTime)) {
                if (auxiliarResponseInt > auxiliarMaior)
                    auxiliarMaior = auxiliarResponseInt;
            }
        }
        jogadores.stream().forEach(jogador -> {
            if (auxiliarMaior == (LocalDate.now().getYear() - jogador.getDataNascimento().getYear())) {
                auxiliarResponseLong = jogador.getId();
            }
        });
        if (auxiliarResponseLong == null) {
            throw new TimeNaoEncontradoException("O Time não existe");
        }
        return auxiliarResponseLong;
    }

    public Long maiorSalario(Long idTime) throws TimeNaoEncontradoException {
        auxiliarResponseLong = null;
        auxiliarMaior = 0;
        auxiliarMaiorDouble = 0;
        for (Jogador jogador : jogadores) {
            auxiliarMaiorDouble = jogador.getSalario().doubleValue();
            if (jogador.getIdTime().equals(idTime)) {
                if (auxiliarMaiorDouble > auxiliarMaior)
                    auxiliarMaior = auxiliarMaiorDouble;
            }
        }
        jogadores.stream().forEach(jogador -> {
            if (auxiliarMaior == jogador.getSalario().doubleValue()) {
                auxiliarResponseLong = jogador.getId();
            }
        });
        if (auxiliarResponseLong == null) {
            throw new TimeNaoEncontradoException("O Time não existe");
        }
        return auxiliarResponseLong;
    }

    public BigDecimal buscaSalarioJogador(Long idJogador) throws JogadorNaoEncontradoException {
        auxiliarMaiorDouble = 0;
        for (Jogador jogador : jogadores) {
            if (jogador.getId().equals(idJogador)) {
                auxiliarMaiorDouble = jogador.getSalario().doubleValue();
            }
        }
        if (auxiliarMaiorDouble == 0) {
            throw new JogadorNaoEncontradoException("Jogador não encontrado");
        }
        return BigDecimal.valueOf((int) auxiliarMaiorDouble);
    }

    public List<Long> topJogadores(Integer top) {
        if (jogadores.size() == 0) {
            return topJogador;
        }
        jogadores.sort(Comparator.comparingInt(Jogador::getNivelHabilidade).reversed());
        for (Jogador jogador: jogadores){
            if(topJogador.size() < top) {
                topJogador.add(jogador.getId());
            }
        }
        return topJogador;
    }

    public List<Long> timeBusca() {
        for (Time time : times) {
            idTimes.add(time.getId());
        }
        return idTimes;
    }
}
