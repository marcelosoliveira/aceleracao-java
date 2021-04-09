package br.com.codenation.paymentmethods;

public class Cash implements PriceStrategy {

    private final double TAXA_DE_DESCONTO_CASH = 0.9;

    @Override
    public Double calculate(Double price) {
        return price * TAXA_DE_DESCONTO_CASH;
    }
}
