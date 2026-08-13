package POO_EX1_5;

public class Principal {
    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque("mouse", 20, 80.00);

        item.mostraEstoque();

        item.adicionarQtd(10);
        item.retirarQuantidade(5);
        item.mostraEstoque();
    }
}
