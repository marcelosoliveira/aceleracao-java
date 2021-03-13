package br.com.curso.usuarios.interfaces;

public interface UsuarioAutorizavel {
    boolean temAutorizacao();

    /*
    * Posso utilizar o método default para interfaces, esse
    * método já vem com uma implementação, padrão caso a classe
    * a ser implementada não possua uma implementação.*/
    default boolean temAutorizazcao() {
        return true;
    }
}
