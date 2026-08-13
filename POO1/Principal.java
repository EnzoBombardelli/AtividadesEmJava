package POO1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 85.00, 10);
        p1.mostrarDados();

        p1.nome = "Teclado";
        p1.mostrarDados();
    }
}
