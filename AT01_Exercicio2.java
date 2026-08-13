public class AT01_Exercicio2 {
    public static void main(String[] args) {
        double vf = calcularDesconto(100.00, 20.0);;
        System.out.println("Preço Original: " + 100.00);
        System.out.println("Percentual de desconto: 20% ");
        System.out.println("Preço final: " + vf);
    }
    public static double calcularDesconto(double preco, double desconto){

        return preco - (preco * (desconto / 100.00));
    }
}
