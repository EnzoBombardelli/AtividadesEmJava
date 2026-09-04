package AT14;

import java.util.Scanner;

public class ControleDeNotasDosAlunos {
    static String[] nomes = new String[5];
    static double[] notas = new double[5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cadastrarAlunos();

        System.out.println("\n--- Lista de Alunos e Notas ---");
        apresentarAlunos();

        System.out.printf("\nMédia da turma: %.2f\n", calcularMedia());
        System.out.printf("Maior nota: %.2f\n", encontrarMaiorNota());
        System.out.printf("Menor nota: %.2f\n", encontrarMenorNota());

        System.out.println("\n--- Situação dos Alunos ---");
        for (int i = 0; i < 5; i++) {
            apresentarSituacao(nomes[i], notas[i]);
        }

        System.out.print("\nInforme o nome de um aluno para buscar: ");
        String nomeBusca = scanner.nextLine();
        int posicao = buscarAluno(nomeBusca);

        if (posicao != -1) {
            System.out.println("Aluno(a) '" + nomeBusca + "' encontrado(a) na posição: " + posicao);
        } else {
            System.out.println("Aluno(a) '" + nomeBusca + "' não está cadastrado(a).");
        }

        scanner.close();
    }

    static void cadastrarAlunos() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
    }

    static void apresentarAlunos() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno: " + nomes[i] + " - Nota: " + notas[i]);
        }
    }

    static double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        return soma / 5;
    }

    static double encontrarMaiorNota() {
        double maior = notas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        return maior;
    }

    static double encontrarMenorNota() {
        double menor = notas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }

    static int buscarAluno(String nomeProcurado) {
        for (int i = 0; i < 5; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                return i;
            }
        }
        return -1;
    }

    static void apresentarSituacao(String nome, double nota) {
        String situacao = (nota >= 6.0) ? "Aprovado" : "Reprovado";
        System.out.println("Aluno: " + nome + " - Nota: " + nota + " - Situação: " + situacao);
    }
}