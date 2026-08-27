package Outros.Composicao;


public class Principal {


    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo", "IdeaPad Slim 3", "Ryzen 7",8);


        System.out.println("DADOS INICIAIS");
        computador.apresentarComputador();


        System.out.println("\nLIGANDO");
        computador.ligarComputador();


        System.out.println("\nDADOS ATUALIZADOS");
        computador.apresentarComputador();


        System.out.println("\nDESLIGANDO");
        computador.desligarComputador();
    }
}
