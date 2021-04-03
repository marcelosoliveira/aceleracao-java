package com.acceleracao.oauth2.dto;

import com.acceleracao.oauth2.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

import static com.acceleracao.oauth2.security.WebSecurityConfigAdapter.passwordEncoder;

public class UsuarioCustomDTO implements UserDetails {

    private String login;
    private String senha;

    public UsuarioCustomDTO(Usuario usuario) {
        this.login = usuario.getLogin();
        this.senha = usuario.getSenha();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
