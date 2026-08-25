package Composicao;


public class Computador {
    private String fabricante;
    private String modelo;
    private Processador processador;

    public Computador(String fabricante,String modelo,String modeloProcessador, int quantidadeNucleos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.processador = new Processador(modeloProcessador, quantidadeNucleos);
    }

    public void ligarComputador() {
        System.out.println("Ligando o computador " + modelo + "...");
        processador.ligar();
    }

    public void desligarComputador() {
        System.out.println("Desligando o computador " + modelo + "...");
        processador.desligar();
    }

    public void apresentarComputador() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo do computador: " + modelo);
        processador.apresentarProcessador();
    }
}

