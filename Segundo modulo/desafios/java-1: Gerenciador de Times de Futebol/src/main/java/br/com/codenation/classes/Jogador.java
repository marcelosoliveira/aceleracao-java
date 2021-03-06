package br.com.codenation.classes;

import br.com.codenation.classes.repositorios.Repositorios;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;
import br.com.codenation.validacao.ValidacaoCampo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Jogador {
    private Long id;
    private Long idTime;
    private String nome;
    private LocalDate dataNascimento;
    private Integer nivelHabilidade;
    private BigDecimal salario;

    public Jogador(Long id, Long idTime, String nome, LocalDate dataNascimento,
        Integer nivelHabilidade, BigDecimal salario) {
        setId(id);
        setIdTime(idTime);
        setNome(nome);
        setDataNascimento(dataNascimento);
        setNivelHabilidade(nivelHabilidade);
        setSalario(salario);
    }

    ValidacaoCampo valida = new ValidacaoCampo();
    Repositorios repositorios = new Repositorios();

    public Long getId() {
        return id;
    }

    public void setId(Long id) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampoId(id)) {
            this.id = id;
        } else {
            throw  new IdentificadorUtilizadoException("Campo id Inválido");
        }

    }

    public Long getIdTime() {
        return this.idTime;
    }

    public void setIdTime(Long idTime) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampoId(idTime)) {
            this.idTime = idTime;
        } else {
            throw  new IdentificadorUtilizadoException("Campo id Inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampo(nome)) {
            this.nome = nome;
        } else {
            throw  new IdentificadorUtilizadoException("Campo nome Inválido");
        }

    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampoData(dataNascimento)) {
            this.dataNascimento = dataNascimento;
        } else {
            throw  new IdentificadorUtilizadoException("Campo data Inválido");
        }
    }

    public Integer getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(Integer nivelHabilidade) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampoInteiro(nivelHabilidade)) {
            this.nivelHabilidade = nivelHabilidade;
        } else {
            throw  new IdentificadorUtilizadoException("Campo habilidade Inválido");
        }

    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampoSalario(salario)) {
            this.salario = salario;
        } else {
            throw  new IdentificadorUtilizadoException("Campo salario Inválido");
        }
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", idTime=" + idTime +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", nivelHabilidade=" + nivelHabilidade +
                ", salario=" + salario +
                '}';
    }
}
