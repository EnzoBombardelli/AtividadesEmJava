package Heranca0;

public class Conta {
    private String titular;
    private int nconta;
    private double saldo;

    public Conta(String titular, int nconta, double saldo) {
        this.titular = titular;
        this.nconta = nconta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNconta() {
        return nconta;
    }

    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + titular);
        System.out.println("Saldo: R$ %.2f%n" + saldo);
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("O valor do depósito deve ser maior que");
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realixado com sucesso!");
        }else{
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }
}

