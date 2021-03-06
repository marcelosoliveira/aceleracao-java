package br.com.codenation;

import br.com.codenation.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
           DesafioMeuTimeApplication dm = new DesafioMeuTimeApplication();
           try {
               dm.incluirTime(1L, "Time 1", LocalDate.now(),
                       "Azul", "Verde");
               dm.incluirTime(2L, "Time 2", LocalDate.now(),
                       "Amarelo", "Vermelho");

               dm.incluirJogador(2L, 1L, "João Lagarto",
                       LocalDate.of(2000, 12, 20),
                       80, BigDecimal.valueOf(15000.00));
               dm.incluirJogador(1L, 1L, "José Gol",
                       LocalDate.of(2002, 9, 7),
                       90, BigDecimal.valueOf(18750.00));

               dm.incluirJogador(4L, 2L, "João Tripa",
                       LocalDate.of(2000, 12, 20),
                       80, BigDecimal.valueOf(15000.00));
               dm.incluirJogador(5L, 2L, "José Mulher",
                       LocalDate.of(2002, 9, 7),
                       90, BigDecimal.valueOf(18750.00));

               dm.definirCapitao(1L);

               System.out.println(dm.buscarCapitaoDoTime(1L));

               System.out.println(dm.buscarNomeJogador(2L));

               System.out.println(dm.buscarNomeTime(2L));

               System.out.println(dm.buscarJogadoresDoTime(1L));

               System.out.println(dm.buscarMelhorJogadorDoTime(1L));

               System.out.println(dm.buscarJogadorMaisVelho(1L));

               System.out.println(dm.buscarTimes());

               System.out.println(dm.buscarJogadorMaiorSalario(1L));

               System.out.println(dm.buscarSalarioDoJogador(1L));

               System.out.println(dm.buscarTopJogadores(3));

           } catch (IdentificadorUtilizadoException i) {
               System.out.println("message: " + i.getMessage());
           } catch (TimeNaoEncontradoException t) {
               System.out.println("message: " + t.getMessage());
           } catch (JogadorNaoEncontradoException j) {
               System.out.println("message: " + j.getMessage());
           } catch (CapitaoNaoInformadoException c) {
               System.out.println("message: " + c.getMessage());
           }
    }
}
