package artigotdd.calculadora.teste.calculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {

    Calculadora calculadora = new Calculadora();

    @Test
    public void deveriaSomarDoisValoresPassados () throws Exception {
        int valorA = 1;
        int valorB = 2;

        int soma = calculadora.soma(valorA, valorB);
        int subtrai = calculadora.subtrai(valorB, valorA);

        assertEquals(3, soma);
        assertEquals(1, subtrai);
    }

    @Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero () throws Exception {
        int valorA = 6;
        int valorB = 0;
        int divide = calculadora.divide(valorA, valorB);

        assertEquals(3, divide);
    }

}
