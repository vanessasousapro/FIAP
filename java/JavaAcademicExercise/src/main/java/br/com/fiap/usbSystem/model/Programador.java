package br.com.fiap.usbSystem.model;

public class Programador extends Funcionario{

     public int ramal;

    public Programador() {
        super();
    }

    public Programador(String nome, String cpf, Endereco endereco, double salarioFixo, int ramal) {
        super(nome, cpf, endereco, salarioFixo);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public double getBonus() {return this.getSalarioFixo() * 0.02;}

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome()
                + "\nRamal: " + this.getRamal()
                + "\nEndereço: " + this.getEndereco().getEnderecoCompleto()
                + "\nSalario Mensal: R$" + this.getSalarioFixo()
                + "\nBonus Semestral: " + this.getBonus();
    }
}
