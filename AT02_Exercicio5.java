public class AT02_Exercicio5 {
    public static void mostrarConsumo(String nome, double consumo) {
        System.out.println("Morador: " + nome);
        System.out.println("Consumo: " + consumo + " m³");
    }

    public static double calcularValorConta(double consumo) {
        return consumo * 4.50;
    }

    public static String classificarConsumo(double consumo) {
        if (consumo <= 10) {
            return "Baixo";
        } else if (consumo <= 20) {
            return "Médio";
        } else {
            return "Alto";
        }
    }

    public static void main(String[] args) {
        String nomeMorador = "Enzo Bombardelli";
        double consumoM3 = 14.89;

        mostrarConsumo(nomeMorador, consumoM3);

        double valorConta = calcularValorConta(consumoM3);
        String classificacao = classificarConsumo(consumoM3);

        System.out.printf("Valor da Conta: R$ %.2f\n", valorConta);
        System.out.println("Classificação do Consumo: " + classificacao);
    }
}

