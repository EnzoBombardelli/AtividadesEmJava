package Heranca0;

public class ContaPJ extends Conta{
    private String cnpj;

    public ContaPJ(String titular, int nconta, double saldo, String cnpj) {
        super(titular, nconta, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("CNPJ: " + cnpj);
    }
}
