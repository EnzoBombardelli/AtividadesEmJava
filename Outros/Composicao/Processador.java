package Outros.Composicao;


public class Processador {
    private String modelo;
    private int quantidadeNucleos;
    private boolean ligado;

    Processador(String modelo,int quantidadeNucleos) {
        setModelo(modelo);
        setQuantidadeNucleos(quantidadeNucleos);
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Erro: o Outros.modelo não pode ficar vazio.");
        }
    }

    public int getQuantidadeNucleos() {
        return quantidadeNucleos;
    }

    private void setQuantidadeNucleos(
            int quantidadeNucleos
    ) {
        if (quantidadeNucleos > 0) {
            this.quantidadeNucleos = quantidadeNucleos;
        } else {
            System.out.println("Erro: a quantidade de núcleos deve ser positiva.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O processador já está ligado.");
        } else {
            ligado = true;
            System.out.println("Processador ligado com sucesso.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println( "O processador já está desligado.");
        } else {
            ligado = false;
            System.out.println("Processador desligado com sucesso.");
        }
    }

    public void apresentarProcessador() {
        System.out.println("Modelo do processador: " + modelo);


        System.out.println("Quantidade de núcleos: "+ quantidadeNucleos);


        if (ligado) {
            System.out.println("Estado do processador: ligado");
        } else {
            System.out.println("Estado do processador: desligado");
        }
    }
}
