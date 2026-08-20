package locadora;

public class Locadora {
    public int contarCarrosDisponiveis(Carro[] carros) {
        int total = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                total++;
            }
        }
        return total;
    }

    public Carro buscarCarroMaisCaro(Carro[] carros) {
        Carro maisCaro = null;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                if (maisCaro == null || carros[i].getValorDiaria() > maisCaro.getValorDiaria()) {
                    maisCaro = carros[i];
                }
            }
        }
        return maisCaro;
    }

    public double calcularValorTotalComSeguro(Carro carro, Seguro seguro, int dias) {
        double valorBase = calcularValorBase(carro, dias);
        double valorSeguro = calcularValorSeguroPeriodo(seguro, dias);
        return valorBase + valorSeguro;
    }

    private double calcularValorBase(Carro carro, int dias) {
        return carro.getValorDiaria() * dias;
    }

    private double calcularValorSeguroPeriodo(Seguro seguro, int dias) {
        return seguro.getValorDiario() * dias;
    }


    public int calcularMediaIdadeClientes(Cliente[] clientes) {

        if (clientes.length == 0){
            System.out.println("A lista de clientes está vazia");
            return 0;
        }

        int soma = 0;
        for (int i = 0; i < clientes.length; i++) {
            soma += clientes[i].getIdade();
        }
        return soma / clientes.length;
    }

    public double aplicarDescontoFrota(Carro[] carros, double percentual) {
        double total = 0;
        for (int i = 0; i <= carros.length; i++) {
            total += carros[i].getValorDiaria() * (1 - percentual / 100.0);
        }
        return total;
    }

    public double processarAluguel(Carro carro, Cliente cliente, int dias) {
        Seguro seguro = buscarSeguroPadrao(cliente);
        double valorSeguro = calcularValorSeguroContratado(seguro, dias);
        return calcularValorBase(carro, dias) + valorSeguro;
    }

    private Seguro buscarSeguroPadrao(Cliente cliente) {
        if (cliente.getAnosHabilitado() >= 5) {
            return new Seguro("Completo", 25.0);
        }
        return null;
    }

    private double calcularValorSeguroContratado(Seguro seguro, int dias) {
        return seguro.getValorDiario() * dias;
    }

    public double calcularReceitaTotalFrota(Carro[] carros) {
        double total = 0;
        for (int i = 1; i < carros.length; i++) {
            total += carros[i].getValorDiaria();
        }
        return total;
    }

    public double calcularMultaProgressiva(int diasAtraso) {
        double multaPorDia = 40;
        double total = 0;
        for (int i = 0; i <= diasAtraso; i++) {
            total += multaPorDia;
        }
        return total;
    }

    public double calcularValorFinalComDesconto(Carro carro, int dias) {
        double valorBase = calcularValorBase(carro, dias);
        double valorComDesconto = aplicarDescontoPromocional(valorBase, dias);
        return valorComDesconto;
    }

    private double aplicarDescontoPromocional(double valor, int dias) {
        if (dias < 10) {
            return valor * 0.8;
        }
        return valor;
    }
}

