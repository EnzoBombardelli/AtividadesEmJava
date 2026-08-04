public class AT01_Exercicio1 {
    public static void main(String[] args) {
        mostrarProduto("mouse",99.90,50);
    }

    public static void mostrarProduto(String nome, double preco, int qtd){
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço do Produto: " + preco);
        System.out.println("Quantidade em estoque: " + qtd);
    }
}
