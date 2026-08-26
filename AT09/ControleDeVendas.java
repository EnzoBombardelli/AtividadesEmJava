package AT09;
import java.util.Scanner;
public class ControleDeVendas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vendas =new int[7];
        int meta = 20;

        mostrarCabecalho();
        preencherVendas(vendas, entrada);

        System.out.println("\n---- VENDAS REGISTRADAS ----");
        mostrarVendas(vendas);

        int total = calcularTotal(vendas);
        double mediaDiaria = (double) total / vendas.length;
        int maior = maiorVenda(vendas);
        int diasMeta = metasAtingidas(vendas, meta);

        System.out.println("\n--- RESUMO DA SEMANA ---");
        System.out.println("Total de produtos vendidos: " + total);
        System.out.printf("Média diária de vendas: %.2f\n", mediaDiaria);
        System.out.println("Maior quantidade vendida em um dia: " + maior);
        System.out.println("Dias em que a meta (20) foi atingida: " + diasMeta);

        entrada.close();
    }

    public static void mostrarCabecalho(){
        System.out.println("Sistema Controle de vendas");
        System.out.println("----------------------------");
    }

    public static void preencherVendas(int[] vendas, Scanner entrada){
        for (int i = 0; i < vendas.length; i++) {
            System.out.print("Digite a quantidade de vendas no dia " + (i + 1) + ": ");
            int vendaLida = entrada.nextInt();

            while (vendaLida < 0) {
                System.out.println("Quantidade inválida! Digite um valor positivo");
                System.out.print("Digite novamente a quantidade de vendas dia " + (i + 1) + ": ");
                vendaLida = entrada.nextInt();
            }
            vendas[i] = vendaLida;
        }
    }

    public static int calcularTotal(int[] vendas){
        int total = 0;
        for (int i = 0; i < vendas.length; i++){
            total += vendas[i];
        }
        return total;
    }

    public static int maiorVenda(int[] vendas){
        int maiorVenda = 0;
        for (int i = 0; i < vendas.length; i++){
            if (vendas[i] > maiorVenda){
                maiorVenda = vendas[i];
            }
        }
        return maiorVenda;
    }

    public static int metasAtingidas(int[] vendas, int meta){
        int metasAtingidas = 0;
        for (int i = 0; i < vendas.length; i++){
            if (vendas[i] >= meta){
                metasAtingidas ++;
            }
        }
        return metasAtingidas;
    }

    public static void mostrarVendas(int[] vendas){
        for (int i = 0; i < vendas.length; i++){
            System.out.println("Vendas do dia " + (i + 1) + ": " + vendas[i]);
        }
    }
}