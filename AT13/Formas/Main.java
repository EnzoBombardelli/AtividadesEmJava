package AT13.Formas;

public class Main {
    public static void main(String[] args) {
        Forma[] vetorDeFormas = new Forma[2];

        vetorDeFormas[0] = new Retangulo("Terreno Retangular", 10.5, 20.0);
        vetorDeFormas[1] = new Circulo("Piscina Circular", 3.0);

        for (Forma f : vetorDeFormas) {
            f.apresentarDados();
        }
    }
}