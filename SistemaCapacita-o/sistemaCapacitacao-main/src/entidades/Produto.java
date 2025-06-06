package entidades;

public class Produto {
    private double valorTotal;
    private int quantidadeEstoque;
    private String nome;
    private double preco;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double totalPreco(){
        return preco*quantidadeEstoque;
    }

    public void removerItem(int quantidade){
        quantidadeEstoque -= quantidade;
    }

    public void adicionarItem(int quantidade){
        quantidadeEstoque += quantidade;
    }
}
