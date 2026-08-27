package Outros.modelo;

public class Funcionario {
    private double salario;
    protected String nome;
    int codigoInterno;
    public String empresa;

    public Funcionario(double salario, String nome, int codigoInterno, String empresa) {
        this.salario = salario;
        this.nome = nome;
        this.codigoInterno = codigoInterno;
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void apresentarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Empresa: " + empresa);
        System.out.println("Código: " + codigoInterno);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }

    void apresentarCodigoInterno(){
        System.out.println("Código: " + codigoInterno);
    }

    public void apresentarSalarioConfidencial(){
        System.out.printf("Salário: R$ %.2f%n", salario);
    }

    public void executarRealatorioInterno(){
        System.out.println("Relatório interno: ");
        apresentarDados();
    }
    protected void apresentarNome(){
        System.out.println("Nome: " + nome);
    }
}
