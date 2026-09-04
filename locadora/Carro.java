package locadora;

/**
 * Representa um carro disponível em uma locadora de veículos.
 * Armazena informações essenciais do veículo, como placa, modelo, valor da diária
 * e o seu status atual de disponibilidade para aluguel.
 */
public class Carro {

    private String placa;
    private String modelo;
    private double valorDiaria;
    private boolean disponivel;

    /**
     * Cria uma nova instância de Carro.
     * Por padrão, todo carro recém-cadastrado é inicializado como disponível.
     *
     * @param placa       A placa de identificação do veículo.
     * @param modelo      O modelo ou nome do veículo.
     * @param valorDiaria O custo cobrado por dia de locação do carro.
     */
    public Carro(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}