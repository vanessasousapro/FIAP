package br.com.fiap.restaurant.view;

import br.com.fiap.restaurant.model.Bebida;
import br.com.fiap.restaurant.model.PratoQuente;
import br.com.fiap.restaurant.model.Produto;

public class MainRestaurant {
    public static void main(String[] args) {
        Bebida bebida = new Bebida("Suco de Laranja", "Àgua, Laranja, Açucar, Gelo", 10.00, 500);
        System.out.println("Bebida");
        System.out.println("A Bebida Informada foi: " + bebida.getNome());
        System.out.println("A Bebida é Composta por: " + bebida.getIngredientes());
        System.out.println("E custa R$ " + bebida.getPreco());
        System.out.println("E a sua quantidade é de: " + bebida.getQuantidade() + "ml");
        System.out.println(bebida.getResumo());

        PratoQuente prato = new PratoQuente();
        prato.setNome("Omelete");
        prato.setIngredientes("Ovo, Tomate, Cebola, e Queijo");
        prato.setPreco(15.00);
        prato.setServe(2);
        System.out.println("Prato");
        System.out.println("O prato informado foi: " + prato.getNome());
        System.out.println("É comporto por: " + prato.getIngredientes());
        System.out.println("E custa R$ " + prato.getPreco());
        System.out.println("E serve " + prato.getServe() + " pessoas");
        System.out.println(prato.getResumo());
    }
}
