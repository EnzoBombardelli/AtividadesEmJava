package AT14;
import java.util.Scanner;

public class AnaliseDeVendasComMatriz {
    static int[][] vendas = new int[3][4];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        preencherMatriz();

        System.out.println("\n--- Matriz de Vendas ---");
        apresentarMatriz();

        System.out.println("\nTotal geral de vendas: " + somarVendas());
        System.out.println("Maior venda registrada: " + encontrarMaiorVenda());
        System.out.println("Menor venda registrada: " + encontrarMenorVenda());

        System.out.println("\n--- Vendas por Vendedor ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Vendedor " + (i + 1) + ": " + somarLinha(i));
        }

        System.out.println("\n--- Vendas por Semana ---");
        for (int j = 0; j < 4; j++) {
            System.out.println("Semana " + (j + 1) + ": " + somarColuna(j));
        }

        System.out.println("\nSoma da diagonal principal: " + somarDiagonalPrincipal());

        scanner.close();
    }

    static void preencherMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe a venda do Vendedor " + (i + 1) + " na Semana " + (j + 1) + ": ");
                vendas[i][j] = scanner.nextInt();
            }
        }
    }

    static void apresentarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(vendas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int somarVendas() {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                soma += vendas[i][j];
            }
        }
        return soma;
    }

    static int encontrarMaiorVenda() {
        int maior = vendas[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (vendas[i][j] > maior) {
                    maior = vendas[i][j];
                }
            }
        }
        return maior;
    }

    static int encontrarMenorVenda() {
        int menor = vendas[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (vendas[i][j] < menor) {
                    menor = vendas[i][j];
                }
            }
        }
        return menor;
    }

    static int somarLinha(int linha) {
        int soma = 0;
        for (int j = 0; j < 4; j++) {
            soma += vendas[linha][j];
        }
        return soma;
    }

    static int somarColuna(int coluna) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += vendas[i][coluna];
        }
        return soma;
    }

    static int somarDiagonalPrincipal() {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += vendas[i][i];
        }
        return soma;
    }
}