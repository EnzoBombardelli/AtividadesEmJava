package TrabalhoAlgebraLinear;

public class Verificador {

    public static boolean isQuadrada(int[][] matriz) {
        return matriz.length == matriz[0].length;
    }

    public static boolean isDiagonal(int[][] matriz) {
        if (!isQuadrada(matriz)) return false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSimetrica(int[][] matriz) {
        if (!isQuadrada(matriz)) return false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}