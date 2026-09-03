package AT13.Animais;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal.");
    }

    public void apresentarDados() {
        System.out.println("Nome do animal: " + this.nome);
    }
}