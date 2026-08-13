package AT05_Exercicio5;

class ItemEstoque {
    String nome;
    int quantidade;
    double preco;

    public ItemEstoque(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = Math.max(quantidade, 0);
        this.preco = preco;
    }

    public void adicionarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Sucesso: " + quantidade + " unidade(s) de '" + this.nome + "' adicionada(s).");
        } else {
            System.out.println("Erro: Não é possível adicionar uma quantidade negativa ou nula.");
        }
    }

    public void retirarQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: Não é possível retirar uma quantidade negativa ou nula.");
        } else if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Sucesso: " + quantidade + " unidade(s) de '" + this.nome + "' retirada(s).");
        } else {
            System.out.println("Erro: Quantidade insuficiente em estoque. Saldo atual: " + this.quantidade);
        }
    }

    public void mostrarEstoque() {
        System.out.println("\n--- Resumo do Estoque ---");
        System.out.println("Item: " + this.nome);
        System.out.println("Quantidade Disponível: " + this.quantidade);
        System.out.printf("Preço Unitário: R$ %.2f\n", this.preco);
        System.out.printf("Valor Total no Estoque: R$ %.2f\n", (this.quantidade * this.preco));
        System.out.println("-------------------------\n");
    }
}