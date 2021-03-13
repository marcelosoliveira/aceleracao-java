package br.com.codenation.classes;

import java.time.LocalDate;

import br.com.codenation.classes.repositorios.Repositorios;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;
import br.com.codenation.validacao.ValidacaoCampo;

public class Time {
    private Long id;
    private String nome;
    private LocalDate dataCriacao;
    private String corUniformePrincipal;
    private String corUniformeSecundario;

    public Time(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal,
                String corUniformeSecundario) {
        setId(id);
        setNome(nome);
        setDataCriacao(dataCriacao);
        setCorUniformePrincipal(corUniformePrincipal);
        setCorUniformeSecundario(corUniformeSecundario);
    }

    ValidacaoCampo valida = new ValidacaoCampo();

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

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampoData(dataCriacao)) {
            this.dataCriacao = dataCriacao;
        } else {
            throw  new IdentificadorUtilizadoException("Campo data Inválido");
        }
    }

    public String getCorUniformePrincipal() {
        return corUniformePrincipal;
    }

    public void setCorUniformePrincipal(String corUniformePrincipal) throws IdentificadorUtilizadoException {
        if (valida.validacaoCampo(corUniformePrincipal)) {
            this.corUniformePrincipal = corUniformePrincipal;
        } else {
            System.out.println(corUniformePrincipal);
            throw  new IdentificadorUtilizadoException("Campo cor principal Inválido");
        }
    }

    public String getCorUniformeSecundario() {
        return corUniformeSecundario;
    }

    public void setCorUniformeSecundario(String corUniformeSecundario)
            throws IdentificadorUtilizadoException {
        if (valida.validacaoCampo(corUniformeSecundario)) {
            this.corUniformeSecundario = corUniformeSecundario;
        } else {
            throw  new IdentificadorUtilizadoException("Campo cor secundária Inválido");
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", corUniformePrincipal='" + corUniformePrincipal + '\'' +
                ", corUniformeSecundario='" + corUniformeSecundario + '\'' +
                '}';
    }
}
