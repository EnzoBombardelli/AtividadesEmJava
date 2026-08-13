package POO_EX1_5;

public class ItemEstoque {
    String nomeItem;
    int quantidadeDisponivel;
    double precoUnitario;

    public ItemEstoque(String nomeItem,  int quantidadeDisponivel, double precoUnitario){
        this.nomeItem = nomeItem;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.precoUnitario = precoUnitario;
    }
    public void adicionarQtd(int quantidade){
        if (quantidade > 0){
            quantidadeDisponivel += quantidade;
            System.out.println(quantidade + "unidade(s) adicionada(s)");
        } else {
            System.out.println("A quantidade adicionada deve ser positiva!");
        }
    }
    public void retirarQuantidade(int quantidade){
        if (quantidade<=0){
            System.out.println("A quantidade retirada deve ser positiva!");
        } else if (quantidade <= quantidadeDisponivel){
            quantidadeDisponivel -= quantidade;
            System.out.println(quantidade + "unidade(s) retiradas(s)");
        }else {
            System.out.println("Não há quantidades suficiente no estoque para a r");
        }
    }
    public void mostraEstoque(){
        double valorTotal = quantidadeDisponivel * precoUnitario;

        System.out.println("=== Dados do estoque ===");
        System.out.println("Item: " + nomeItem);
        System.out.println("Quantidade disponível: " + quantidadeDisponivel);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Valor total do estoque: R$ %.2f%n", valorTotal);
    }
}
