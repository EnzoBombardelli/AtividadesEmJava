package AT05_Exercicio6;

public class Temperatura {
    private String nomeDaCidade;
    private double temperaturaAtual;
    private String unidadeDeMedida;

    public Temperatura(String nomeDaCidade, double temperaturaAtual, String unidadeDeMedida) {
        this.nomeDaCidade = nomeDaCidade;
        this.temperaturaAtual = temperaturaAtual;
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public void aumentarTemperatura(double valor) {
        if (valor > 0) {
            this.temperaturaAtual += valor;
            System.out.println("Temperatura aumentada em " + valor + " " + this.unidadeDeMedida);
        } else {
            System.out.println("Erro: O valor para aumentar a temperatura deve ser positivo!");
        }
    }

    public void diminuirTemperatura(double valor) {
        if (valor > 0) {
            this.temperaturaAtual -= valor;
            System.out.println("Temperatura diminuída em " + valor + " " + this.unidadeDeMedida);
        } else {
            System.out.println("Erro: O valor para diminuir a temperatura deve ser positivo!");
        }
    }

    public void mostrarDados() {
        System.out.println("-----------------------------------");
        System.out.println("Cidade: " + this.nomeDaCidade);
        System.out.println("Temperatura Atual: " + this.temperaturaAtual + " " + this.unidadeDeMedida);
        System.out.println("-----------------------------------");
    }
}