package Heranca1;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Nessa", 13, 7.50, "Au Au", "Lhasa");
        Gato gato1 = new Gato("Zeca", 9, 4.00, "Miau", "Shell Cameo");
        Passaro passaro1 = new Passaro("Bolotinha", 0, 0.1, "Pru Pru", "Rolinha-roxa");

        System.out.println("------------------------------");
        cachorro1.mostrarDados();
        System.out.println("------------------------------");
        gato1.mostrarDados();
        System.out.println("------------------------------");
        passaro1.mostrarDados();
    }
}