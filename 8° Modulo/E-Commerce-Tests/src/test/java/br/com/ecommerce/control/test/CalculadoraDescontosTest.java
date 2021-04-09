package br.com.ecommerce.control.test;

import br.com.ecommerce.control.CalculadoraDesconto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDescontosTest {

    @Test
    public void naoDarDescontoValorAbaixoDoMinimoDeDesconto () {
        //Arrange
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valorCompra = 499.99;
        double valorEsperadoAposCompra = 474.99;

        //Act
        double valorRetornadoAposCalculo = calculadoraDesconto.calcular((valorCompra));

        //Assert
        assertEquals(valorEsperadoAposCompra, valorRetornadoAposCalculo, 0.001);

    }

    @Test
    public void darDescontoDe10PorCentoValorAcimaDe500Reais () {
        //Arrange
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valorCompra = 500;
        double valorEsperadoAposCompra = 450;

        //Act
        double valorRetornadoAposCalculo = calculadoraDesconto.calcular((valorCompra));

        //Assert
        assertEquals(valorEsperadoAposCompra, valorRetornadoAposCalculo, 0);
    }

    @Test
    public void darDescontoDe10PorCentoValorAcimaDe600Reais () {
        //Arrange
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valorCompra = 600;
        double valorEsperadoAposCompra = 540;

        //Act
        double valorRetornadoAposCalculo = calculadoraDesconto.calcular((valorCompra));

        //Assert
        assertEquals(valorEsperadoAposCompra, valorRetornadoAposCalculo, 0);
    }

    @Test
    public void darDescontoDe10PorCentoValorAcimaDe739Reais () {
        //Arrange
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valorCompra = 739.50;
        double valorEsperadoAposCompra = 665.55;

        //Act
        double valorRetornadoAposCalculo = calculadoraDesconto.calcular((valorCompra));

        //Assert
        assertEquals(valorEsperadoAposCompra, valorRetornadoAposCalculo, 0.001);
    }

    @Test
    public void darDescontoDe20PorCentoValorAcimaDe1000Reais () {
        //Arrange
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valorCompra = 1000.00;
        double valorEsperadoAposCompra = 800.00;

        //Act
        double valorRetornadoAposCalculo = calculadoraDesconto.calcular((valorCompra));

        //Assert
        assertEquals(valorEsperadoAposCompra, valorRetornadoAposCalculo, 0);
    }

}
