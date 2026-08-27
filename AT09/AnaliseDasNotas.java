package AT09;
import java.util.Scanner;
public class AnaliseDasNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[6];

        mostrarCabecalho();

        preencherNotas(notas, entrada);

        System.out.println("\n---- RELATÓRIOS DAS NOTAS ----");
        mostrarNotas(notas);

        double media = calcularMedia(notas);
        int aprovados = contarAprovados(notas);
        int reprovados = notas.length - aprovados;

        System.out.println("\n---- RESUMO DA TURMA ----");
        System.out.printf("Média da turma: %.2f\n", media);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);

        entrada.close();
    }

    public static void mostrarCabecalho(){
        System.out.println("Sistema analizador de notas");
        System.out.println("----------------------------");
    }

    public static void preencherNotas(double[] notas, Scanner entrada) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double notaLida = entrada.nextDouble();

            while (notaLida < 0 || notaLida > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0.0 e 10.0.");
                System.out.print("Digite novamente a nota do aluno " + (i + 1) + ": ");
                notaLida = entrada.nextDouble();
            }
            notas[i] = notaLida;
        }
    }

    public static double calcularMedia(double[] notas){
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static int contarAprovados(double[] notas){
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++){
            if (notas[i] >= 6){
                aprovados ++;
            }
        }
        return aprovados;
    }

    public static void mostrarNotas(double[] notas){
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }
}