package AT10.Composicao;

public class Motor {
    private double cilindrada;
    private String combustivel;
    private boolean ligado;

    public Motor(double cilindrada, String combustivel) {
        setCilindrada(cilindrada);
        setCombustivel(combustivel);
        this.ligado = false;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        } else {
            System.out.println("Erro: a cilindrada deve ser positiva.");
        }
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        if (combustivel != null && !combustivel.trim().isEmpty()) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Erro: combustível não pode ficar vazio.");
        }
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O motor já está ligado.");
        } else {
            this.ligado = true;
            System.out.println("Motor ligado com sucesso.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O motor já está desligado.");
        } else {
            this.ligado = false;
            System.out.println("Motor desligado com sucesso.");
        }
    }

    public void apresentarMotor() {
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}