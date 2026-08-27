package AT10.Composicao;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2.0, "Flex");

        carro.apresentarCarro();
        carro.ligarCarro();
        carro.desligarCarro();
    }

}