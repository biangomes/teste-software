package br.beanascigom.testesoftware;

public class Usuario {
    private String nome;

    public Usuario() {}

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
