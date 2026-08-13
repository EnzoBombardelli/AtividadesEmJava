package AT06_;

public class ReservaHotel {
    private String nomeHospede;
    private int numeroQuarto;
    private int quantidadeDiarias;
    private double valorDiaria;

    public ReservaHotel(String nomeHospede, int numeroQuarto, int quantidadeDiarias, double valorDiaria) {
        setNomeHospede(nomeHospede);
        setNumeroQuarto(numeroQuarto);
        setQuantidadeDiarias(quantidadeDiarias);
        setValorDiaria(valorDiaria);
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        if (nomeHospede != null && !nomeHospede.trim().isEmpty()) {
            this.nomeHospede = nomeHospede;
        } else {
            System.out.println("Erro: O nome do hóspede não pode ficar vazio!");
        }
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        if (numeroQuarto > 0) {
            this.numeroQuarto = numeroQuarto;
        } else {
            System.out.println("Erro: O número do quarto deve ser positivo!");
        }
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        if (quantidadeDiarias > 0) {
            this.quantidadeDiarias = quantidadeDiarias;
        } else {
            System.out.println("Erro: A quantidade de diárias deve ser maior que zero!");
        }
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        } else {
            System.out.println("Erro: O valor da diária deve ser maior que zero!");
        }
    }

    @Override
    public String toString() {
        return "Reserva [Hóspede: " + nomeHospede +
                ", Quarto: " + numeroQuarto +
                ", Diárias: " + quantidadeDiarias +
                ", Valor da Diária: R$ " + valorDiaria + "]";
    }

    public double calcularHospedagem() {
        return quantidadeDiarias * valorDiaria;
    }

    public double calcularHospedagem(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("Erro: O desconto deve estar entre 0 e 100!");
            return calcularHospedagem();
        }
        double valorNormal = calcularHospedagem();
        double valorDesconto = valorNormal * (percentualDesconto / 100);
        return valorNormal - valorDesconto;
    }

    public double calcularHospedagem(double percentualDesconto, double taxaServico) {
        if (taxaServico < 0) {
            System.out.println("Erro: A taxa de serviço não pode ser negativa!");
            return calcularHospedagem(percentualDesconto);
        }
        double valorComDesconto = calcularHospedagem(percentualDesconto);
        return valorComDesconto + taxaServico;
    }
}