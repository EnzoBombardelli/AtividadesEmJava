package AT12;
import java.util.Scanner;
public class ValidacaoArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo (com extensão): ");
        String arquivo = scanner.nextLine().strip();

        if (arquivo.isBlank()) {
            System.out.println("Erro: O nome do arquivo não pode estar vazio.");
        } else {
            String arquivoMin = arquivo.toLowerCase();
            boolean ehPdf = arquivoMin.endsWith(".pdf");

            int indicePonto = arquivo.lastIndexOf('.');
            String nomeSemExtensao = (indicePonto != -1) ? arquivo.substring(0, indicePonto) : arquivo;
            String nomeComUnderline = arquivo.replace(" ", "_");

            System.out.println("\n--- Análise do Arquivo ---");
            System.out.println("Possui extensão .pdf? " + (ehPdf ? "Sim" : "Não"));
            System.out.println("Nome em minúsculas: " + arquivoMin);
            System.out.println("Apenas o nome (sem extensão): " + nomeSemExtensao);
            System.out.println("Espaços substituídos por '_': " + nomeComUnderline);
        }

        scanner.close();
    }
}