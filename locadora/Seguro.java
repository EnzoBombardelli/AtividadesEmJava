package locadora;

public class Seguro {
    private String tipo;
    private double valorDiario;

    public Seguro(String tipo, double valorDiario){
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
