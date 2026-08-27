package Outros.aplicacao;

import Outros.modelo.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(4500, "Maria Clara", 4321, "UniFil");
        System.out.println("Empresa: " + f.empresa);
        System.out.println(f.getSalario());
        System.out.println(f.getNome());
        System.out.println(f.getCodigoInterno());
        f.setSalario(9999);
        f.apresentarDados();

        Gerente g = new Gerente(8000, "Enzo Bombardelli", 4321, "UniFil", 1500);
        g.apresentarGerente();
        System.out.printf("Salário final: R$ %.2f%n", g.calcularSalario());
    }
}
