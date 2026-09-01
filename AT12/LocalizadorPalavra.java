package AT12;
import java.util.Scanner;
public class LocalizadorPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a palavra a ser procurada: ");
        String busca = scanner.nextLine();

        String fraseMin = frase.toLowerCase();
        String buscaMin = busca.toLowerCase();

        int primeiraOcorrencia = fraseMin.indexOf(buscaMin);

        if (primeiraOcorrencia != -1) {
            int ultimaOcorrencia = fraseMin.lastIndexOf(buscaMin);

            System.out.println("\n--- Resultado da Busca ---");
            System.out.println("A palavra \"" + busca + "\" foi encontrada!");
            System.out.println("Posição da primeira ocorrência (índice): " + primeiraOcorrencia);
            System.out.println("Posição da última ocorrência (índice): " + ultimaOcorrencia);
        } else {
            System.out.println("\nA palavra \"" + busca + "\" não foi encontrada na frase.");
        }

        scanner.close();
    }
}
