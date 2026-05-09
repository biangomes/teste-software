package br.beanascigom.testesoftware;

import java.math.BigDecimal;

public class Lance {

    private BigDecimal valor;
    private Leilao leilao;
    private Usuario usuario;

    public Lance() {}

    public Lance(BigDecimal valor, Leilao leilao) {
        this.valor = valor;
        this.leilao = leilao;
    }

    public Lance(Usuario usuario, BigDecimal valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }

    public Leilao getLeilao() {
        return this.leilao;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }
}
