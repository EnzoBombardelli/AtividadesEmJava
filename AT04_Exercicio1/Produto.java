package AT04_Exercicio1;

public class Produto {
    String nome;
    String modelo;
    double preco;
    int qtd;

    public Produto(String nome, String modelo, double preco, int qtd) {
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
        this.qtd = qtd;
    }
    public Produto(){ }
    public Produto(String nome, String modelo){
        this.nome = nome;
        this.modelo = modelo;
    }
    @Override
    public String toString(){
        return "Nome: " + nome
                + "\nModelo: " + modelo
                + "\nPreço: " + preco
                + "\nQuantidade em estoque: " + qtd + "\n";
    }
}