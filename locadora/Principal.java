package locadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Carro[] carros = {
                new Carro("ABC1234", "Onix", 100.0),
                new Carro("XYZ9988", "Corolla", 220.0),
                new Carro("JJK4521", "HB20", 90.0),
                new Carro("QRS7788", "Civic", 250.0)
        };
        carros[1].setDisponivel(false);

        Cliente[] clientesIniciais = {
                new Cliente("Maria", 25, 5),
                new Cliente("Nessa", 19, 0),
                new Cliente("Enzo", 30, 3)
        };

        Cliente[] clientesNovos = {};

        Seguro seguroCompleto = new Seguro("Completo", 25.0);

        Locadora locadora = new Locadora();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Carros disponiveis: " + locadora.contarCarrosDisponiveis(carros));
                    break;
                case 2:
                    Carro maisCaro = locadora.buscarCarroMaisCaro(carros);
                    System.out.println("Carro mais caro disponivel: " + maisCaro.getModelo() + " (R$" + maisCaro.getValorDiaria() + "/dia)");
                    break;
                case 3:
                    System.out.println("Valor total do Onix por 5 dias, com seguro completo: R$" + locadora.calcularValorTotalComSeguro(carros[0], seguroCompleto, 5));
                    break;
                case 4:
                    System.out.println("Calculando media de idade...");
                    System.out.println("Media de idade: " + locadora.calcularMediaIdadeClientes(clientesNovos));
                    break;
                case 5:
                    System.out.println("Valor da frota com 10% de desconto: R$" + locadora.aplicarDescontoFrota(carros, 10));
                    break;
                case 6:
                    System.out.println("Processando aluguel do Onix para o cliente Enzo (3 anos de habilitacao)...");
                    System.out.println("Valor total: R$" + locadora.processarAluguel(carros[0], clientesIniciais[2], 5));
                    break;
                case 7:
                    System.out.println("Receita total da frota: R$" + locadora.calcularReceitaTotalFrota(carros));
                    break;
                case 8:
                    System.out.println("Multa para 3 dias de atraso: R$" + locadora.calcularMultaProgressiva(3));
                    break;
                case 9:
                    System.out.println("Valor final do Onix por 15 dias, com desconto promocional: R$" + locadora.calcularValorFinalComDesconto(carros[0], 15));
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n===== SISTEMA LOCADORA - OPERACOES =====");
        System.out.println("1 - Contar carros disponiveis");
        System.out.println("2 - Buscar carro mais caro disponivel");
        System.out.println("3 - Calcular valor total com seguro");
        System.out.println("4 - Calcular media de idade dos clientes");
        System.out.println("5 - Aplicar desconto na frota");
        System.out.println("6 - Processar aluguel com seguro padrao do cliente");
        System.out.println("7 - Calcular receita total da frota");
        System.out.println("8 - Calcular multa por atraso");
        System.out.println("9 - Calcular valor final com desconto promocional");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }
}
