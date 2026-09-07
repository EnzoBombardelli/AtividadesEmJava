package TrabalhoAlgebraLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("\nEncerrando a Calculadora de Matrizes... Até mais!");
                break;
            }

            processarOpcao(opcao, sc);

        } while (opcao != 0);

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=========================================");
        System.out.println("         CALCULADORA DE MATRIZES         ");
        System.out.println("=========================================");
        System.out.println("1 - Ler e Imprimir Matriz");
        System.out.println("2 - Somar Matrizes (A + B)");
        System.out.println("3 - Subtrair Matrizes (A - B)");
        System.out.println("4 - Multiplicar por Escalar (k * A)");
        System.out.println("5 - Transposta de uma Matriz (A^T)");
        System.out.println("6 - Multiplicação de Matrizes (A * B)");
        System.out.println("7 - Gerar Matriz Identidade");
        System.out.println("8 - Verificar se é Matriz Diagonal");
        System.out.println("9 - Verificar se é Matriz Simétrica");
        System.out.println("0 - Sair");
        System.out.println("=========================================");
        System.out.print("Digite a opção desejada: ");
    }

    private static void processarOpcao(int opcao, Scanner sc) {
        int[][] mA, mB, mC;

        switch (opcao) {
            case 1:
                mA = Funcoes.lerMatriz(sc, "");
                Funcoes.pausar(sc);
                Funcoes.imprimirMatriz(mA, "Matriz Lida");
                break;

            case 2:
                mA = Funcoes.lerMatriz(sc, "A");
                mB = Funcoes.lerMatriz(sc, "B");
                mC = Operacoes.somar(mA, mB);

                if (mC == null) {
                    System.out.println("Erro: Só é possível somar matrizes com as mesmas dimensões!");
                } else {
                    Funcoes.pausar(sc);
                    Funcoes.imprimirMatriz(mA, "Matriz A");
                    Funcoes.imprimirMatriz(mB, "Matriz B");
                    Funcoes.imprimirMatriz(mC, "Matriz Resultado");
                }
                break;

            case 3:
                mA = Funcoes.lerMatriz(sc, "A");
                mB = Funcoes.lerMatriz(sc, "B");
                mC = Operacoes.subtrair(mA, mB);

                if (mC == null) {
                    System.out.println("Erro: Só é possível subtrair matrizes com as mesmas dimensões!");
                } else {
                    Funcoes.pausar(sc);
                    Funcoes.imprimirMatriz(mA, "Matriz A");
                    Funcoes.imprimirMatriz(mB, "Matriz B");
                    Funcoes.imprimirMatriz(mC, "Matriz Resultado");
                }
                break;

            case 4:
                mA = Funcoes.lerMatriz(sc, "");
                System.out.print("Digite o escalar da matriz: ");
                int escalar = sc.nextInt();

                mC = Operacoes.multiplicarEscalar(mA, escalar);
                Funcoes.pausar(sc);
                Funcoes.imprimirMatriz(mA, "Matriz Original");
                Funcoes.imprimirMatriz(mC, "Matriz Escalada por " + escalar);
                break;

            case 5:
                mA = Funcoes.lerMatriz(sc, "");
                mC = Operacoes.transpor(mA);

                Funcoes.pausar(sc);
                Funcoes.imprimirMatriz(mA, "Matriz Original");
                Funcoes.imprimirMatriz(mC, "Matriz Transposta");
                break;

            case 6:
                mA = Funcoes.lerMatriz(sc, "A");
                mB = Funcoes.lerMatriz(sc, "B");
                mC = Operacoes.multiplicar(mA, mB);

                if (mC == null) {
                    System.out.println("Erro: Colunas de A devem ser iguais às linhas de B.");
                } else {
                    Funcoes.pausar(sc);
                    Funcoes.imprimirMatriz(mA, "Matriz A");
                    Funcoes.imprimirMatriz(mB, "Matriz B");
                    Funcoes.imprimirMatriz(mC, "Matriz Resultado");
                }
                break;

            case 7:
                System.out.print("Digite a ordem da matriz: ");
                int ordem = sc.nextInt();
                mC = Operacoes.gerarIdentidade(ordem);

                Funcoes.pausar(sc);
                Funcoes.imprimirMatriz(mC, "Matriz Identidade");
                break;

            case 8:
                mA = Funcoes.lerMatriz(sc, "");
                Funcoes.pausar(sc);
                Funcoes.imprimirMatriz(mA, "Matriz Analisada");

                if (!Verificador.isQuadrada(mA)) {
                    System.out.println("\nA matriz deve ser quadrada para ser diagonal.");
                } else {
                    System.out.println(Verificador.isDiagonal(mA) ? "\nA matriz É diagonal!" : "\nA matriz NÃO é diagonal!");
                }
                break;

            case 9:
                mA = Funcoes.lerMatriz(sc, "");
                Funcoes.pausar(sc);
                Funcoes.imprimirMatriz(mA, "Matriz Analisada");

                if (!Verificador.isQuadrada(mA)) {
                    System.out.println("\nA matriz deve ser quadrada para ser simétrica.");
                } else {
                    System.out.println(Verificador.isSimetrica(mA) ? "\nA matriz É simétrica!" : "\nA matriz NÃO é simétrica!");
                }
                break;

            default:
                System.out.println("\nOpção inválida! Escolha um número de 0 a 9.");
                break;
        }
    }
}