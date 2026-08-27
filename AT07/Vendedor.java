package AT07;

public class Vendedor extends Funcionario{
    private double valorVenda;
    private double percentualComissao;

    public Vendedor(String nome, int matricula, double salarioBase, double valorVenda, double percentualComissao) {
        super(nome, matricula, salarioBase);
        this.valorVenda = valorVenda;
        this.percentualComissao = percentualComissao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        if (valorVenda <= 0){
            System.out.println("Valor de venda deve ser maior que zero.");
        } else {
            this.valorVenda = valorVenda;
        }
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao < 0 || percentualComissao > 100){
            throw new IllegalArgumentException(
                    "O percentual de comissão deve estar entre 0 e 100."
            );
        }
        this.percentualComissao = percentualComissao;
    }

    @Override
    public void apresentarDados() {
        System.out.println("Cargo: Vendedor");
        super.apresentarDados();

        System.out.printf("Valor de vendas: R$ %.2f%n", valorVenda);
        System.out.printf("Percentual de comissão: %.2f%%%n", percentualComissao);
        System.out.printf("Valor da comissão: R$%.2f%n", calcularComissao());
    }

    public double calcularComissao(){
        return getSalarioBase() + percentualComissao / 100;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + calcularComissao();
    }
}