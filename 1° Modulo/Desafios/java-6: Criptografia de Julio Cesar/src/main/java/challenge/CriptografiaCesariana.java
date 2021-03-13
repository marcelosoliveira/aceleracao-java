package challenge;

import java.util.IllformedLocaleException;
import java.util.concurrent.RejectedExecutionException;

public class CriptografiaCesariana implements Criptografia {

  private void erroVazioNulo(String texto) {
    if (texto.isEmpty() || texto.equals(null))
      throw new IllegalArgumentException("Texto vazio ou nulo!");
  }

  private String processoDoTexto(String texto, int num) {
    String crypto = "";
    for (int count = 0; count < texto.length(); count += 1) {
      if (texto.charAt(count) != ' '
        && !Character.toString(texto.charAt(count)).matches("[0-9]")) {
        crypto = crypto.concat(Character.toString((char) (texto.charAt(count) + num)));
      } else {
        crypto = crypto.concat(Character.toString(texto.charAt(count)));
      }
    }
    return crypto;
  }

  @Override
  public String criptografar(String texto) {
    erroVazioNulo(texto);
    return processoDoTexto(texto.toLowerCase(), 3);
  }

  @Override
  public String descriptografar(String texto) {
    erroVazioNulo(texto);
    return processoDoTexto(texto.toLowerCase(), - 3);
  }

}
