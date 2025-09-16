package br.com.fiap.marketplace.model;

public class Usuario {

    private String username;
    private String password;
    private String email;

    public Usuario() {
    }

    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

