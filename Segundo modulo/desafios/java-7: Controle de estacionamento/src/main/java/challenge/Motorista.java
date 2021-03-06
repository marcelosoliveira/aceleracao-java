package challenge;


import java.util.Objects;

public class Motorista {

    private final String nome;

    private final int idade;

    private final int pontos;

    private final String habilitacao;

    private Motorista(String nome, int idade, int pontos, String habilitacao) {
        this.nome = nome;
        this.idade = idade;
        this.pontos = pontos;
        this.habilitacao = habilitacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getPontos() {
        return pontos;
    }

    public String getHabilitacao() {
        return habilitacao;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Motorista motorista = (Motorista) o;
        return Objects.equals(habilitacao, motorista.habilitacao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(habilitacao);
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pontos=" + pontos +
                ", habilitacao='" + habilitacao + '\'' +
                '}';
    }

    public static MotoristaBuilder builder() {
        return new MotoristaBuilder();
    }


    public static class MotoristaBuilder {

        private String nome;

        private int idade;

        private int pontos;

        private String habilitacao;

        private MotoristaBuilder() {
        }

        public MotoristaBuilder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public MotoristaBuilder withIdade(int idade) throws IllegalArgumentException {
            if (idade < 0) {
                throw new IllegalArgumentException();
            }
            this.idade = idade;
            return this;
        }

        public MotoristaBuilder withPontos(int pontos) throws IllegalArgumentException {
            if (pontos < 0) {
                throw new IllegalArgumentException();
            }
            this.pontos = pontos;
            return this;
        }

        public MotoristaBuilder withHabilitacao(String habilitacao) {
            this.habilitacao = habilitacao;
            return this;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) throws NullPointerException {
            if (nome.isEmpty() || nome.equals(null)) {
                throw new NullPointerException();
            }
            this.nome = nome;
        }

        public String getHabilitacao() {
            return habilitacao;
        }

        public void setHabilitacao(String habilitacao) throws NullPointerException {
            if (habilitacao.isEmpty() || habilitacao.equals(null)) {
                throw new NullPointerException();
            }
            this.habilitacao = habilitacao;
        }

        public Motorista build() {
            Motorista motorista = new Motorista(nome, idade, pontos, habilitacao);
            setNome(nome);
            setHabilitacao(habilitacao);
            return motorista;
        }
    }
}
