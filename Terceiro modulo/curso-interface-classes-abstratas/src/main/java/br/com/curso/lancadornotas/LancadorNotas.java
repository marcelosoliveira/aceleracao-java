package br.com.curso.lancadornotas;

import br.com.curso.usuarios.UsuarioAutorizavel;

public class LancadorNotas {
    public void login(UsuarioAutorizavel usuarioAutorizavel) {
        boolean autorizacao = usuarioAutorizavel.temAutorizacao();
        if (autorizacao) {
            System.out.println("Usuário autorizado.");
        } else {
            System.out.println("Usuario não autorizado!");
        }
    }
}
