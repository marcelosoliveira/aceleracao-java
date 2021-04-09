package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {

    private final double TAXA_DE_DESCONTO_DEBIT_CARD = 0.95;

    @Override
    public Double calculate(Double price) {
        return price * TAXA_DE_DESCONTO_DEBIT_CARD;
    }
}
