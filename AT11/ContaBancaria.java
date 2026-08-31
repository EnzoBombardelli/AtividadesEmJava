package AT11;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    protected double saldo;
    public String nomeBanco;

    public ContaBancaria(String titular, String numeroConta, double saldo, String nomeBanco) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeBanco = nomeBanco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Valor de saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Banco: " + nomeBanco);
        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
    }
}