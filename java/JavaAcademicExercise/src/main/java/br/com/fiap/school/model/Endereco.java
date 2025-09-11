package br.com.fiap.school.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Endereco {

    private String logradouro;
    private int numero;
    private String cep;
    private Cidade cidade;

    public Endereco(String logradouro, int numero, String cep, Cidade cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
    }

}
