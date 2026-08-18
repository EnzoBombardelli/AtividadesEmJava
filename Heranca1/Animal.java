package Heranca1;

public class Animal {
    String nome;
    int idade;
    double peso;
    String som;

    public Animal(String nome, int idade, double peso, String som) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Som: " + som);
    }
}
