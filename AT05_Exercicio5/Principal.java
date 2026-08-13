package AT05_Exercicio5;


public class Principal {
    public static void main(String[] args) {
        ItemEstoque produto = new ItemEstoque("Monitor 24 polegadas", 10, 750.50);
        produto.mostrarEstoque();
        produto.adicionarQuantidade(5);
        produto.adicionarQuantidade(-2);
        produto.retirarQuantidade(3);
        produto.retirarQuantidade(20);
        produto.mostrarEstoque();
    }
}