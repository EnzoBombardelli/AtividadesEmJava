package AT04_Exercicio2;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Enzo Bombardelli", "22867-1", 2000.00);

        conta.mostrarSaldo();

        conta.depositar(200.00);
        conta.mostrarSaldo();

        conta.sacar(300.00);
        conta.mostrarSaldo();

        conta.sacar(600.00);
        conta.mostrarSaldo();
    }
}