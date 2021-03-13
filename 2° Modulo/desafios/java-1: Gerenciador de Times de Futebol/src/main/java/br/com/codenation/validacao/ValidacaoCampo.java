package br.com.codenation.validacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ValidacaoCampo {
    public boolean validacaoCampo(String campo) {
        return campo != null && campo.length() > 3 && !campo.isEmpty();
    }

    public boolean validacaoCampoData(LocalDate campo) {
        return campo != null ;
    }

    public boolean validacaoCampoInteiro(Integer campo) {
        return campo != null && campo != 0 && campo > 0;
    }

    public boolean validacaoCampoId(Long campo) {
        return campo != null && campo != 0 && campo > 0;
    }

    public boolean validacaoCampoSalario(BigDecimal campo) {
        return campo != null;
    }
}
