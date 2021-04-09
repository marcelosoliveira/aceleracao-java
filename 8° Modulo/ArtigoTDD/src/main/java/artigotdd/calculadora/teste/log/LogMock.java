package artigotdd.calculadora.teste.log;

public class LogMock implements GeradorDeLog {

    private String nome;

    @Override
    public void criaLog(String nomeDaPessoa) {
        this.nome = nomeDaPessoa;
    }

    public String getNome() {
        return nome;
    }
}

