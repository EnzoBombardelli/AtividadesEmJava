public class AT01_Exercicio3 {
    public static void main(String[] args) {
        double somaNotas = notas(6.0, 8.0, 7.0);
        double mediaNotas = mediaNotas(somaNotas);
        String verificarSituacao = verificarSituação(mediaNotas);

        System.out.println("A soma das notas é: " + somaNotas);
        System.out.println("A media das notas é: " + mediaNotas);
        System.out.println("Situação: " + verificarSituacao);
    }
    public static double notas(double nota1, double nota2, double nota3){
        return nota1 + nota2 + nota3;
    }
    public static double mediaNotas(double somaNotas){
        return somaNotas / 3;
    }
    public static String verificarSituação(double verificarSituacao){
        if (verificarSituacao > 5.9){
            return "Aprovado!";
        }else{
            return "Reprovado!";
        }

    }
}
