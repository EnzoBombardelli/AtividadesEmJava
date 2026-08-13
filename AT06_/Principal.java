package AT06_;

public class Principal {
    public static void main(String[] args) {

        ReservaHotel reserva1 = new ReservaHotel("Enzo", 101, 5, 120.00);
        ReservaHotel reserva2 = new ReservaHotel("Maria", 205, 3, 200.00);

        System.out.println("🏨 --- BEM-VINDO AO HOTEL --- 🏨\n");

        System.out.println("Detalhes da Primeira Reserva:");
        System.out.println(reserva1);

        System.out.println("\nDetalhes da Segunda Reserva:");
        System.out.println(reserva2);

        System.out.println("\n💰 --- CALCULANDO OS VALORES --- 💰\n");

        double valorNormalR1 = reserva1.calcularHospedagem();
        System.out.printf("Valor normal da reserva do Enzo: R$ %.2f\n", valorNormalR1);

        double valorComDescontoR2 = reserva2.calcularHospedagem(10.0);
        System.out.printf("Valor da reserva da Maria com 10%% de desconto: R$ %.2f\n", valorComDescontoR2);

        double valorComDescontoETaxaR2 = reserva2.calcularHospedagem(15.0, 50.0);
        System.out.printf("Valor da reserva da Maria com 15%% de desconto + R$ 50 de taxa: R$ %.2f\n", valorComDescontoETaxaR2);
    }
}