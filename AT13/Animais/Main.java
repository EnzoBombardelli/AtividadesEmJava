package AT13.Animais;

public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro("Nessa");
        Animal meuGato = new Gato("Zeca");

        meuCachorro.apresentarDados();
        meuCachorro.emitirSom();

        System.out.println();

        meuGato.apresentarDados();
        meuGato.emitirSom();
    }
}
