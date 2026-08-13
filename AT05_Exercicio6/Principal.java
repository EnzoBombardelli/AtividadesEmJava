package AT05_Exercicio6;

public class Principal {
    public static void main(String[] args) {
        Temperatura tempLondrina = new Temperatura("Londrina", 22.8, "°C");

        System.out.println("Dados iniciais:");
        tempLondrina.mostrarDados();
        tempLondrina.aumentarTemperatura(3.5);
        tempLondrina.diminuirTemperatura(2.0);
        System.out.println("\nDados atualizados:");
        tempLondrina.mostrarDados();
    }
}