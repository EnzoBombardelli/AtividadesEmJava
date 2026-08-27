package AT07;

public class Gerente extends Funcionario {
    private double valorBonus;

    public Gerente(String nome, int matricula, double salarioBase, double valorBonus) {
        super(nome, matricula, salarioBase);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus < 0) {
            System.out.println("O valor do bônus não pode ser negativo.");
        } else {
            this.valorBonus = valorBonus;
        }
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorBonus;
    }

    @Override
    public void apresentarDados() {
        System.out.println("Cargo: Gerente");
        super.apresentarDados();
        System.out.printf("Valor do bônus: R$ %.2f%n", valorBonus);
    }

    public void realizarReuniao() {
        System.out.println("O gerente " + getNome() + " está conduzindo uma reunião com a equipe.");
    }
}