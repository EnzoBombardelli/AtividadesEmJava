package AT04_Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Veiculo v1 =  new Veiculo("Corlla", "Toyota", 0);

        v1.mostrraDados();

        v1.acelerar(50);
        v1.mostrraDados();

        v1.frear(30);
        v1.mostrraDados();

        v1.acelerar(60);
        v1.mostrraDados();
    }
}
