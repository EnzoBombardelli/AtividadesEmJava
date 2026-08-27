package Outros.Agregacao;

public class Principal {


    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Enzo", "Atacante", 22);
        Jogador jogador2 = new Jogador("Maria", "Meio-campista", 8);

        Time time = new Time("São Paulo Futebol Clube", "São Paulo", jogador1);
        System.out.println("DADOS INICIAIS");
        time.apresentarTime();
        System.out.println("\nTROCA DE CAPITÃO");
        time.trocarCapitao(jogador2);
        System.out.println("\nDADOS ATUALIZADOS");
        time.apresentarTime();
        System.out.println("ANTIGO CAPITÃO CONTINUA EXISTINDO");
        jogador1.apresentarJogador();
    }
}
