package br.com.curso.credito.externo;

public class Pessoa {
    private String cpf;
    private String nome;
    private long scoreSerasa;
    private long scoreSpc;
    private long qtdChequesDesvolvidos;
    private long valorDivida;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getScoreSerasa(int i) {
        return scoreSerasa;
    }

    public void setScoreSerasa(long scroreSerasa) {
        this.scoreSerasa = scroreSerasa;
    }

    public long getScoreSpc(int i) {
        return scoreSpc;
    }

    public void setScoreSpc(long scoreSpc) {
        this.scoreSpc = scoreSpc;
    }

    public long getQtdChequesDesvolvidos(int i) {
        return qtdChequesDesvolvidos;
    }

    public void setQtdChequesDesvolvidos(Long qtdChequesDesvolvidos) {
        this.qtdChequesDesvolvidos = qtdChequesDesvolvidos;
    }

    public long getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(long valorDivida) {
        this.valorDivida = valorDivida;
    }
}
