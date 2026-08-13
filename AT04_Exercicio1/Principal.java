package AT04_Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Chuteira Nike Street Gato", "Futsal", 649.99, 22);
        Produto produto2 = new Produto("Chuteira Nike Mercurial Vapor 14", "Society", 699.99, 10);
        Produto produto3 = new Produto("Chuteira Nike Tiempo 10", "Campo", 699.9, 8);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
    }
}