package br.com.fiap.school.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Aluno {

    private int rm;
    private String nome;
    private Endereco endereco;

    public Aluno() {
    }

}
