package AT11.Principal;
import AT11.ContaPoupanca;
public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca(
                "Enzo Bombardelli",
                "123",
                2800.67,
                "Banco Inter",
                1.93
        );

        conta1.exibirDados();
        conta1.depositar(400);
        conta1.sacar(822.00);
        conta1.aplicarRendimento();
        conta1.exibirDados();
    }
}