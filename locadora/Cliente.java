package locadora;

/**
 * Representa um cliente da locadora de veículos.
 * Mantém as informações pessoais do cliente e as regras de negócio
 * relacionadas à sua aptidão para realizar uma locação.
 */
public class Cliente {

    private String nome;
    private int idade;
    private int anosHabilitado;

    /**
     * Cria uma nova instância de Cliente.
     *
     * @param nome           O nome do cliente.
     * @param idade          A idade atual do cliente.
     * @param anosHabilitado O tempo, em anos, que o cliente possui carteira de habilitação.
     */
    public Cliente(String nome, int idade, int anosHabilitado) {
        this.nome = nome;
        this.idade = idade;
        this.anosHabilitado = anosHabilitado;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAnosHabilitado() {
        return anosHabilitado;
    }

    /**
     * Verifica se o cliente cumpre os requisitos mínimos para alugar um carro.
     * Para ser considerado apto, a regra de negócio da locadora exige que o
     * cliente tenha 21 anos ou mais e no mínimo 2 anos de habilitação.
     *
     * @return {@code true} se o cliente for apto para locação, {@code false} caso contrário.
     */
    public boolean isApto() {
        return idade >= 21 && anosHabilitado >= 2;
    }
}