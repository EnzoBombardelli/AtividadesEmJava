package AT04_Exercicio3;

public class Veiculo {
    String modelo;
    String marca;
    int velocidade;

    public  Veiculo (String modelo, String marca, int velocidade){
        this.modelo = modelo;
        this.marca = marca;
        if (velocidade >= 0){
            this. velocidade = velocidade;
        } else {
            this.velocidade = 0;
        }
    }

    public void acelerar(int valor){
        if (valor > 0) {
            velocidade = velocidade + valor;
            System.out.println("O veículo acelerou " + valor + "Km/h");
        } else {
            System.out.println("O valor para frear deve ser positivo!");
            }
        }
        public void frear(int valor) {
            if (valor <= 0){
                System.out.println("O valor para frear deve ser positivo!");
            } else {
                if (valor >= velocidade){
                    velocidade = 0;
                } else {
                    velocidade = velocidade - valor;
                    System.out.println("O veículo reduziu para " + velocidade + "Km/h");
                }
            }

        }

        public void mostrraDados() {
            System.out.println("=== Dados do veículo! ===");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Velocidade atual: " + velocidade + "Km/h");
            System.out.println();
        }
    }
