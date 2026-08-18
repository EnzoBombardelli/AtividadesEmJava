package Heranca1;

public class Gato extends Animal{
    private String som;
    private String corPelagem;

    public Gato(String nome, int idade, double peso, String som, String corPelagem) {
        super(nome, idade, peso, som);
        this.corPelagem = corPelagem;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getRaca() {
        return corPelagem;
    }

    public void setRaca(String raca) {
        this.corPelagem = corPelagem;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cor da pelagem: " + corPelagem);
    }
}
