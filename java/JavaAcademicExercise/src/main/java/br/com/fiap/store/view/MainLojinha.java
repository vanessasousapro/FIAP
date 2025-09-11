package br.com.fiap.store.view;

//private: pode ser acessado somente pela propria classe.
//public: pode ser acessado por qualquer outra classe.
//default (sem o modificador): pode ser acessado por qualquer classe que esteja no mesmo pacote.
//protected: pode ser por qualquer classe do mesmo pacote da classe ou por qualquer classe que herde da classe.

import br.com.fiap.store.model.ClienteLojinha;

public class MainLojinha {
    public static void main(String[] args) {
        ClienteLojinha cliente = new ClienteLojinha();
        cliente.setNome("Vanessa");
        cliente.exibirDados();
        System.out.println(cliente.getNome());
    }
}
