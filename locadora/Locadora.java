package locadora;

/**
 * Classe responsavel por gerenciar as operacoes da locadora de veiculos.
 *
 * @author Sistema de Locadora
 */
public class Locadora {

    private static final double[] TABELA_PRECOS = {90.0, 130.0, 180.0};
    private static final int[] LIMIARES_DIAS = {3, 7, 15};
    private static final double[] DESCONTOS = {0.05, 0.10, 0.20};

    public Locadora() {
    }

    /**
     * Conta quantos carros da frota estao disponiveis.
     *
     * @param carros Array de carros da frota.
     * @return Quantidade de carros disponiveis.
     */
    public int contarCarrosDisponiveis(Carro[] carros) {
        int total = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                total++;
            }
        }
        return total;
    }

    /**
     * Soma o valor da diaria de todos os carros da frota.
     *
     * @param carros Array de carros da frota.
     * @return Valor total somado das diarias.
     */
    public double calcularReceitaTotalFrota(Carro[] carros) {
        double total = 0;
        for (int i = 0; i < carros.length; i++) {
            total += carros[i].getValorDiaria();
        }
        return total;
    }

    /**
     * Calcula a media de idade dos clientes informados.
     *
     * @param clientes Array de clientes.
     * @return Media de idade dos clientes.
     */
    public int calcularMediaIdadeClientes(Cliente[] clientes) {
        if (clientes.length == 0) {
            return 0;
        }
        int soma = 0;
        for (int i = 0; i < clientes.length; i++) {
            soma += clientes[i].getIdade();
        }
        return soma / clientes.length;
    }

    /**
     * Busca, entre os clientes informados, o de maior idade.
     *
     * @param clientes Array de clientes.
     * @return Objeto do cliente mais velho.
     */
    public Cliente buscarClienteMaisVelho(Cliente[] clientes) {
        Cliente maisVelho = null;
        for (int i = 0; i < clientes.length; i++) {
            if (maisVelho == null || clientes[i].getIdade() > maisVelho.getIdade()) {
                maisVelho = clientes[i];
            }
        }
        return maisVelho;
    }

    /**
     * Busca um carro pela placa e devolve uma descricao com modelo e valor da diaria.
     *
     * @param carros Array de carros da frota.
     * @param placa Placa do carro a ser buscado.
     * @return Descricao do carro ou null se nao for encontrado.
     */
    public String buscarCarroPorPlaca(Carro[] carros, String placa) {
        Carro encontrado = null;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getPlaca().equals(placa)) {
                encontrado = carros[i];
                break;
            }
        }
        if (encontrado == null) {
            return null;
        }
        return encontrado.getModelo() + " - R$" + encontrado.getValorDiaria() + "/dia";
    }

    /**
     * Calcula a multa por atraso, cobrando R$40,00 por dia de atraso.
     *
     * @param diasAtraso Quantidade de dias em atraso.
     * @return Valor total da multa.
     */
    public double calcularMultaAtraso(int diasAtraso) {
        double multaPorDia = 40;
        double total = 0;
        for (int i = 0; i < diasAtraso; i++) {
            total += multaPorDia;
        }
        return total;
    }

    /**
     * Processa uma locacao completa: valida o carro, calcula o valor bruto
     * e aplica 15% de desconto quando o cliente for apto E o aluguel for de 7 dias ou mais.
     *
     * @param carro Carro a ser alugado.
     * @param cliente Cliente que esta alugando.
     * @param seguro Seguro escolhido.
     * @param dias Quantidade de dias do aluguel.
     * @return Valor final da locacao.
     */
    public double processarLocacaoCompleta(Carro carro, Cliente cliente, Seguro seguro, int dias) {
        validarLocacao(carro);
        double valorBruto = calcularValorBruto(carro, seguro, dias);
        return aplicarDescontosEEncargos(valorBruto, cliente, dias);
    }

    /**
     * Valida se o carro esta disponivel para locacao.
     *
     * @param carro Carro a ser verificado.
     */
    private void validarLocacao(Carro carro) {
        if (!carro.isDisponivel()) {
            throw new IllegalStateException("Carro indisponivel");
        }
    }

    /**
     * Calcula o valor bruto da locacao somando as diarias do carro e do seguro.
     *
     * @param carro Carro alugado.
     * @param seguro Seguro contratado.
     * @param dias Quantidade de dias.
     * @return Valor bruto total.
     */
    private double calcularValorBruto(Carro carro, Seguro seguro, int dias) {
        return (carro.getValorDiaria() + seguro.getValorDiario()) * dias;
    }

    /**
     * Aplica desconto de 15% se o cliente for apto E a locacao for de 7 dias ou mais.
     *
     * @param valorBruto Valor bruto calculado.
     * @param cliente Cliente que esta alugando.
     * @param dias Quantidade de dias.
     * @return Valor final ajustado.
     */
    private double aplicarDescontosEEncargos(double valorBruto, Cliente cliente, int dias) {
        if (cliente.isApto() && dias >= 7) {
            return valorBruto * 0.85;
        }
        return valorBruto;
    }

    /**
     * Calcula a diaria de um aluguel a partir da categoria do veiculo (0, 1 ou 2),
     * multiplicada pela quantidade de dias.
     *
     * @param categoria Indice da categoria (0, 1 ou 2).
     * @param dias Quantidade de dias do aluguel.
     * @return Valor total da diaria.
     */
    public double calcularDiariaComCategoria(int categoria, int dias) {
        if (categoria < 0 || categoria >= TABELA_PRECOS.length) {
            return 0;
        }
        double valorDiaria = TABELA_PRECOS[categoria];
        return valorDiaria * dias;
    }

    /**
     * Gera um resumo com a quantidade de carros disponiveis e o valor medio
     * da diaria apenas dos carros disponiveis.
     *
     * @param carros Array de carros da frota.
     * @return Texto com o resumo da frota.
     */
    public String gerarResumoFrota(Carro[] carros) {
        int disponiveis = 0;
        double somaValores = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                disponiveis++;
                somaValores += carros[i].getValorDiaria();
            }
        }
        double media = disponiveis == 0 ? 0 : somaValores / disponiveis;
        return disponiveis + " carro(s) disponivel(is), media de R$" + media + "/dia";
    }

    /**
     * Aplica um desconto escalonado sobre o valor base, conforme a quantidade
     * de dias alugados: 5% (3+ dias), 10% (7+ dias) ou 20% (15+ dias).
     *
     * @param valorBase Valor base do aluguel.
     * @param dias Quantidade de dias.
     * @return Valor com o desconto aplicado.
     */
    public double calcularDescontoEscalonado(double valorBase, int dias) {
        double desconto = 0;
        for (int i = 0; i < LIMIARES_DIAS.length; i++) {
            if (dias >= LIMIARES_DIAS[i]) {
                desconto = DESCONTOS[i];
            }
        }
        return valorBase * (1 - desconto);
    }

    /**
     * Verifica se o cliente tem direito ao desconto de fidelidade: precisa ter
     * pelo menos 25 anos E pelo menos 3 locacoes anteriores.
     *
     * @param cliente Cliente que esta alugando.
     * @param totalLocacoesAnteriores Numero de locacoes passadas.
     * @return True se for elegivel ou False caso contrario.
     */
    public boolean clienteElegivelDescontoFidelidade(Cliente cliente, int totalLocacoesAnteriores) {
        return cliente.getIdade() >= 25 && totalLocacoesAnteriores >= 3;
    }
}