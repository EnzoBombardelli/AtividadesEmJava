package AT07;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0){
            System.out.println("ERRO: Salário Base deve ser maior que 0");
        } else {
            this.salarioBase = salarioBase;
        }

    }

    public double calcularSalario(){
        return salarioBase;
    }

    public void apresentarDados(){
        System.out.println("NOme: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
    }


}
