package artigotdd.calculadora.teste.pessoa;

import artigotdd.calculadora.teste.log.GeradorDeLog;

public class PessoaController {

    private PessoaDAO pessoaDAO;
    private GeradorDeLog log;

    public PessoaController(GeradorDeLog log) {
        this.pessoaDAO = new PessoaDAO();
        this.log = log;
    }

    public void exclui(Pessoa pessoa) {
        PessoaDAO.exclui(pessoa);
        log.criaLog(pessoa.getNome());
    }
}