package OperacoesBasicasList;

public class Carrinho {
    private String descricaoItem;
    private double preco;
    private int quantidade;

    public Carrinho(String descricaoItem, double preco, int quantidade) {
        this.descricaoItem = descricaoItem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  descricaoItem;
    }
}
