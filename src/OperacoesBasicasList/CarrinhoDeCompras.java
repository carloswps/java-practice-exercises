package OperacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Carrinho> iCarrinho;

    public CarrinhoDeCompras(List<Carrinho> iCarrinho) {
        this.iCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        iCarrinho.add(new Carrinho(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Carrinho> itemParaRemover = new ArrayList<>();
        for (Carrinho item : itemParaRemover) {
            if (item.getDescricaoItem().equalsIgnoreCase(nome)) {
                itemParaRemover.add(item);
            }
        }
    }
    public double calcularValorTotal(){
        double total = 0;
        for (Carrinho item : iCarrinho) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
    public void exibirItens(){
        System.out.println(iCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(null);
        
        carrinho.adicionarItem("Notebook", 3500.00, 1);
        carrinho.adicionarItem("Mouse", 120.00, 2);
        carrinho.adicionarItem("Teclado", 250.00, 1);

        carrinho.removerItem("Mouse");
       carrinho.exibirItens();
    }
}
