public class AT04_Exercicio2 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println("Depósito: ");
        conta.depositar(200);
        conta.mostrarSaldo();

        System.out.println("Saldo: = " + conta.sacar(50));
        conta.depositar(100);
        double retorno = conta.sacar(525);
        if (retorno < 0){
            System.out.println("Saldo insuficiente");
        }
        conta.mostrarSaldo();
    }

    public static class Conta {
        String titular;
        int nconta;
        double saldo;

        double depositar(double valor){
            return saldo += valor;
        }
        double sacar(double valor){
            if ( saldo >= valor ){
                return saldo - valor;
            } else {
                return -1;
            }
        }
        void mostrarSaldo(){
            System.out.println("O seu saldo é: " + saldo);
        }

    }
}