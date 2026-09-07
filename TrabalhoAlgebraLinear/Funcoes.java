package TrabalhoAlgebraLinear;

import java.util.Scanner;

public class Funcoes {

    public static int[][] lerMatriz(Scanner sc, String nomeMatriz) {
        System.out.print("Digite a quantidade de linhas da matriz " + nomeMatriz + ": ");
        int linha = sc.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz " + nomeMatriz + ": ");
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz, String titulo) {
        if (matriz == null) return;

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        System.out.println("--- " + titulo + " (" + linhas + "x" + colunas + ") ---");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void pausar(Scanner sc) {
        sc.nextLine(); // Limpa o buffer
        System.out.print("\nPressione [ENTER] para ver o resultado");
        sc.nextLine(); // Aguarda o enter
        System.out.println();
    }
}