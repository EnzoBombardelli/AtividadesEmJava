import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int numero = 5;
        int valor = 0;
        int tentativa = 3;

        while (tentativa > 0 || valor != numero) {
            System.out.println("Adivinhe o número secreto: ");
            Scanner sc = new Scanner(System.in);
            valor = sc.nextInt();

            if (valor == numero){
                System.out.println("Você acertou!");
                tentativa = -1;
            } else {
                System.out.println("Você errou!");
                tentativa--;
            }
        }
    }
}