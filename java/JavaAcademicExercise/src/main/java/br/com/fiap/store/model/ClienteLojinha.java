package br.com.fiap.store.model;

public class ClienteLojinha {

    protected String nome;
    protected String cpf;
    protected boolean ativo;

     public void exibirDados(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + formatarDado());
    }

    private String formatarDado(){
         if(ativo == true){
             return "Ativo";
         }else {
             return "Inativo";
         }
    }

    public String getNome() {
         return nome;
    }

    public void setNome(String nome) {
         this.nome = nome;
    }

    public String getCpf() {
         return cpf;
    }

    public void setCpf(String cpf) {
         this.cpf = cpf;
    }

    public boolean isAtivo() {
         return ativo;
    }

    public void setAtivo(boolean ativo) {
         this.ativo = ativo;
    }
}
