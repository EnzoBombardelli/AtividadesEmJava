package Agregacao;

public class Time {
    private String nome;
    private String cidade;
    private Jogador capitao;

    public Time(String nome, String cidade, Jogador capitao) {
        this.nome = nome;
        this.cidade = cidade;
        this.capitao = capitao;
    }

    public void trocarCapitao(Jogador novoCapitao) {
        if (novoCapitao != null) {
            this.capitao = novoCapitao;
            System.out.println(novoCapitao.getNome() + " é o novo capitão.");
        } else {
            System.out.println("Erro: o capitão não pode ser nulo.");
        }
    }
    public void apresentarTime() {
        System.out.println("Time: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Capitão:");
        capitao.apresentarJogador();
    }
}

