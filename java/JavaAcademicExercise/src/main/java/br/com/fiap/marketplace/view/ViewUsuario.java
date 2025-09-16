package br.com.fiap.marketplace.view;

import br.com.fiap.marketplace.model.Usuario;

public class ViewUsuario {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Admin", "12345");
        Usuario usuario3 = new Usuario("Admin", "12345", "admin@email.com");
    }
}
