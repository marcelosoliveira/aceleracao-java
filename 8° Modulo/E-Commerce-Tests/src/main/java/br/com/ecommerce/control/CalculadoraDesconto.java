package br.com.ecommerce.control;

public class CalculadoraDesconto {

    private final double LIMIT_MINIMO_DESCONTO_COMPRAS_BASICAS = 500.00;
    private final double TAXA_DESCONTO_APLICADA_COMPRAS_BASICAS = 0.10;
    private final double LIMIT_MINIMO_DESCONTO_COMPRAS_GRANDES = 1000.00;
    private final double TAXA_DESCONTO_APLICADA_COMPRAS_GRANDES = 0.20;
    private final double TAXA_DESCONTO_APLICADA_COMPRAS_POR_IMPULSO  = 0.05;

    public double calcular(double valor) {
        if (valor >= LIMIT_MINIMO_DESCONTO_COMPRAS_GRANDES) {
            return valor - (valor * TAXA_DESCONTO_APLICADA_COMPRAS_GRANDES);
        }

        if (valor >= LIMIT_MINIMO_DESCONTO_COMPRAS_BASICAS) {
            return valor - (valor * TAXA_DESCONTO_APLICADA_COMPRAS_BASICAS);
        }
        return valor - (valor * TAXA_DESCONTO_APLICADA_COMPRAS_POR_IMPULSO) ;
    }
}
