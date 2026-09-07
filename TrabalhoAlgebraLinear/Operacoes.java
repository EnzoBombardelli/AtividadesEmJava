package TrabalhoAlgebraLinear;

public class Operacoes {

    public static int[][] somar(int[][] a, int[][] b) {
        if (!mesmaDimensao(a, b)) return null;

        int linhas = a.length;
        int colunas = a[0].length;
        int[][] c = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static int[][] subtrair(int[][] a, int[][] b) {
        if (!mesmaDimensao(a, b)) return null;

        int linhas = a.length;
        int colunas = a[0].length;
        int[][] c = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public static int[][] multiplicarEscalar(int[][] a, int k) {
        int linhas = a.length;
        int colunas = a[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = a[i][j] * k;
            }
        }
        return resultado;
    }

    public static int[][] transpor(int[][] a) {
        int linhas = a.length;
        int colunas = a[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = a[i][j];
            }
        }
        return transposta;
    }

    public static int[][] multiplicar(int[][] a, int[][] b) {
        int colunasA = a[0].length;
        int linhasB = b.length;

        if (colunasA != linhasB) return null;

        int linhasA = a.length;
        int colunasB = b[0].length;
        int[][] c = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                c[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static int[][] gerarIdentidade(int ordem) {
        int[][] matriz = new int[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
        return matriz;
    }

    private static boolean mesmaDimensao(int[][] a, int[][] b) {
        return a.length == b.length && a[0].length == b[0].length;
    }
}