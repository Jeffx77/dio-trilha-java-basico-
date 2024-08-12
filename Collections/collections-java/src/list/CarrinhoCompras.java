package list;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompras {
    private List<itens> itensList;
    public CarrinhoCompras() {
        this.itensList = new ArrayList<>();
    }
    public void adicionarItem(String descricao, double preco, int quantidade) {
        itensList.add(new itens(descricao, preco, quantidade));
    }
    public void removerItem(String descricao) {
        List<itens> itensARemover = new ArrayList<>();
        for (itens i : itensList) {
            if (i.getDescricao().equalsIgnoreCase(descricao)) {
                itensARemover.add(i);
            }
        }
        itensList.removeAll(itensARemover);
    }
    public double obterValorTotal() {
        double valorTotal = 0;
        for (itens i : itensList) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens() {
        System.out.println(itensList);
 
    }
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem("Camiseta", 50, 2);
        carrinho.adicionarItem("Calça", 100, 1);
        carrinho.adicionarItem("Tênis", 200, 1);
        carrinho.adicionarItem("Meia", 10, 3);
        System.out.println("O valor total da compra é: " + carrinho.obterValorTotal());

        carrinho.exibirItens();

        carrinho.removerItem("Meia");

        carrinho.exibirItens();

        System.out.println("O valor total da compra é: " + carrinho.obterValorTotal());

        carrinho.adicionarItem("Meia", 10, 3);

        carrinho.exibirItens();

        carrinho.removerItem("Meia");
        carrinho.removerItem("Meia");
        carrinho.removerItem("Meia");
        System.out.println("O valor total da compra é: " + carrinho.obterValorTotal());

    
    }
}
