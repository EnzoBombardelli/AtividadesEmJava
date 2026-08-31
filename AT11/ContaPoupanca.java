package AT11;
import AT11.ContaBancaria;
public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, String numeroConta, double saldo, String nomeBanco, double taxaRendimento) {
        super(titular, numeroConta, saldo, nomeBanco);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * (taxaRendimento / 100);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Taxa de rendimento: " + taxaRendimento + "%");
    }
}