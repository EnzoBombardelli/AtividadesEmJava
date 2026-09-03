package AT13.Formas;

class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}