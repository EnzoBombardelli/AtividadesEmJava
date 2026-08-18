package Heranca1;

public class Cachorro extends Animal{
    private String som;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String som, String raca) {
        super(nome, idade, peso, som);
        this.raca = raca;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Raça: " + raca);
    }
}
