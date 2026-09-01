package AT12;
import java.util.Scanner;
public class ValidacaoNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String nome = scanner.nextLine().strip();

        if (nome.isBlank()) {
            System.out.println("Nenhum nome foi informado.");
        } else {
            boolean possuiEspaco = nome.contains(" ");

            System.out.println("\n--- Análise do Nome ---");
            System.out.println("Nome formatado: " + nome);
            System.out.println("Em maiúsculas: " + nome.toUpperCase());
            System.out.println("Total de caracteres: " + nome.length());
            System.out.println("Possui espaço interno: " + (possuiEspaco ? "Sim" : "Não"));

            if (possuiEspaco) {
                System.out.println("Classificação: Nome completo");
            } else {
                System.out.println("Classificação: Apenas um nome");
            }
        }

        scanner.close();
    }
}
