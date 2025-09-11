package br.com.fiap.school.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cidade {
    String nome;
    String estado;

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

}
