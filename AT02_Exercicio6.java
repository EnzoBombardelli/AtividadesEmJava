public class AT02_Exercicio6 {
    public static void main(String[] args) {

        mostrarRelatorio();
    }
    public static int calcularPontos(int v, int e, int d) {
        return v * 3 + e * 1 + d * 0;
    }
    public static double calcularAproveitamento() {

        return (100 * calcularPontos(2,11,25)) / 114;
    }
    public static String verificarSituacao(){
        String resultado = "";
        if (calcularAproveitamento() > 80) {
            resultado ="Excelente";
        }
        if (calcularAproveitamento() > 60 && calcularAproveitamento() < 79) {
            resultado ="Bom";
        }
        if (calcularAproveitamento() > 40 && calcularAproveitamento() < 59) {
            resultado ="Mediano";
        }
        if (calcularAproveitamento() < 40) {
            resultado ="Ruim";
        }
        return resultado;
    }
    public static void mostrarRelatorio(){
        System.out.println("Pontos conquistados: " + calcularPontos(2,11,25));
        System.out.println("Aproveitamento: " + calcularAproveitamento());
        System.out.println("Situação: " + verificarSituacao());
    }
}
