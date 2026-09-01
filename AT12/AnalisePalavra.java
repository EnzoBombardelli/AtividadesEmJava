package AT12;
import java.util.Scanner;
public class AnalisePalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().strip();

        if (palavra.isBlank()) {
            System.out.println("Erro: Você deve informar uma palavra não vazia.");
        } else {
            System.out.println("\n--- Resultado ---");
            System.out.println("Palavra digitada: " + palavra);
            System.out.println("Quantidade de caracteres: " + palavra.length());
            System.out.println("Em maiúsculas: " + palavra.toUpperCase());
            System.out.println("Em minúsculas: " + palavra.toLowerCase());
            System.out.println("Primeiro caractere: " + palavra.charAt(0));
            System.out.println("Último caractere: " + palavra.charAt(palavra.length() - 1));
        }

        scanner.close();
    }
}