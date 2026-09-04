package locadora;

/**
 * Representa um seguro oferecido para a locação de veículos.
 * Mantém as informações sobre o tipo de cobertura oferecida e o custo
 * adicional que esse seguro acrescenta ao valor da diária da locação.
 */
public class Seguro {

    private String tipo;
    private double valorDiario;

    /**
     * Cria uma nova instância de Seguro.
     *
     * @param tipo        O tipo de cobertura do seguro (ex: Total, Parcial, Terceiros).
     * @param valorDiario O custo cobrado por dia pela contratação deste seguro.
     */
    public Seguro(String tipo, double valorDiario) {
        this.tipo = tipo;
        this.valorDiario = valorDiario;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorDiario() {
        return valorDiario;
    }
}