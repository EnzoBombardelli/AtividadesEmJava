package AT12;
import java.util.Scanner;
public class GeradorUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String entrada = scanner.nextLine().strip();

        if (entrada.isBlank()) {
            System.out.println("Erro: O nome não pode estar vazio.");
        } else {
            // Divide o texto ignorando um ou múltiplos espaços consecutivos
            String[] partes = entrada.split("\\s+");

            if (partes.length < 2) {
                System.out.println("Erro: Você deve informar pelo menos um nome e um sobrenome.");
            } else {
                String primeiroNome = partes[0];
                String ultimoSobrenome = partes[partes.length - 1];

                String username = primeiroNome.toLowerCase() + "." + ultimoSobrenome.toLowerCase();

                System.out.println("\n--- Cadastro Concluído ---");
                System.out.println("Primeiro nome: " + primeiroNome);
                System.out.println("Último sobrenome: " + ultimoSobrenome);
                System.out.println("Nome de usuário gerado: " + username);
            }
        }

        scanner.close();
    }
}