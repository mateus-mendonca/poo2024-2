package br.ufpb.dcx.mendonca.mateus.lojaRoupas;

public class Roupa {

    private String codigo;
    private String descricao;
    private int quantidade;
    private Tamanho tamanho;

    public Roupa(String codigo, String descricao, Tamanho tamanho, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", tamanho=" + tamanho +
                '}';
    }
}
