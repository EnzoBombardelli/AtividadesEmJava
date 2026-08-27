package Outros.aplicacao;

import Outros.modelo.Funcionario;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salario, String nome, int codigoInterno, String empresa, double bonus) {
        super(salario, nome, codigoInterno, empresa);
        this.bonus = bonus;
    }
    public void apresentarGerente(){
        System.out.println("Nome: " + nome);
        System.out.println("Empresa: " + empresa);
        System.out.printf("Salário: R$ %.2f%n", getSalario());
        System.out.printf("Bônus: R$ %.2f%n", bonus);
    }
    public double calcularSalario() {
        return getSalario() + this.bonus;
    }
}
