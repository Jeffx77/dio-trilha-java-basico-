package list;

public class itens {

    private String descricao;
    private double preco;
    private int quantidade;

    public itens(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item: " + descricao + " - Preço: " + preco + " - Quantidade: " + quantidade;
    }
}
