package artigotdd.calculadora.teste.pessoa;

import artigotdd.calculadora.teste.log.LogMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaTeste {

    @Test
    public void deveriaCriarUmLogQuandoUmaPessoaForExcluida()
            throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alexandre");

        LogMock nossoLogMock = new LogMock();
        PessoaController pessoaController = new PessoaController(nossoLogMock);
        pessoaController.exclui(pessoa);
        // Como saberemos se realmente o "criaLog" será chamado?
        assertEquals(pessoa.getNome(), nossoLogMock.getNome());
    }
}
