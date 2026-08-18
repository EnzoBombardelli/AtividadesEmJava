package Heranca1;

public class Passaro extends Animal{
    private String som;
    private String especie;

    public Passaro(String nome, int idade, double peso, String som, String especie) {
        super(nome, idade, peso, som);
        this.especie = especie;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getRaca() {
        return especie;
    }

    public void setRaca(String raca) {
        this.especie = especie;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Espécie: " + especie);
    }
}
