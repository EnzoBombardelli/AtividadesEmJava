package AT13.Formas;

class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularArea() {
        return 0.0;
    }

    public void apresentarDados() {
        System.out.println("Forma: " + this.nome);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.println("-------------------------");
    }
}
