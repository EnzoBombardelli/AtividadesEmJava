package Exemplo1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        somar();
        System.out.println("Fim do programa");
        somar(5, 6);
        System.out.println("Fim do programa");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de 1: ");
        int a = sc.nextInt();
        System.out.println("Informe o valor de 2: ");
        int b = sc.nextInt();
        int resultadom = multiplicar(a, b);
        System.out.println("O resultdado da multiplicação é: " + resultadom);
        double resultadod = dividir(a,b);
        System.out.println("O resultdado da divisão é: " + resultadod);
    }
    public static double dividir(int a, int b) {
        return a / b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void somar() {
        System.out.println("A soma de 2 + 2 é = 4");
    }
    public static void somar(int a, int b) {
        System.out.println("A soma de "+ a + "+"+b+" é = "+ (a+b));
    }
}
