package POO1;

public class Produto {
    String nome;
    double preco;
    int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + qtd);
    }
}
