package Agregacao;

public class Jogador {
    private String nome;
    private String posicao;
    private int numeroCamisa;

    public Jogador(String nome, String posicao, int numeroCamisa) {
        setNome(nome);
        setPosicao(posicao);
        setNumeroCamisa(numeroCamisa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ficar vazio.");
        }
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        if (posicao != null && !posicao.trim().isEmpty()) {
            this.posicao = posicao;
        } else {
            System.out.println("Erro: a posição deve ser informada.");
        }
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        if (numeroCamisa > 0) {
            this.numeroCamisa = numeroCamisa;
        } else {
            System.out.println("Erro: o número da camisa deve ser positivo.");
        }
    }

    public void apresentarJogador() {
        System.out.println("Jogador: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Número da camisa: " + numeroCamisa);
    }
}
