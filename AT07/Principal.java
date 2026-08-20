package AT07;

public class Principal {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Maria Clara", 108, 7000.00, 1500.00);
        gerente.apresentarDados();
        System.out.printf("Salário Final: R$ %.2f%n", gerente.calcularSalario());
        gerente.realizarReuniao();
        System.out.println("---------------------------------------------");

        Vendedor vendedor = new Vendedor("Nessa e Silva", 102, 3500.00, 30000.00, 10.0);
        vendedor.apresentarDados();
        System.out.printf("Salário Final: R$ %.2f%n", vendedor.calcularSalario());
        System.out.println("---------------------------------------------");

        Estagiario estagiario = new Estagiario("Enzo Bombardelli", 122, 1700.00, "Centro Universitário Filadéfia");
        estagiario.apresentarDados();
        System.out.printf("Salário Final: R$ %.2f%n", estagiario.calcularSalario());
        estagiario.realizarTreinamento();
    }
}