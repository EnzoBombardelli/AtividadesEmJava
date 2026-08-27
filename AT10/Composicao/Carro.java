package AT10.Composicao;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, double cilindrada, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(cilindrada, combustivel);
    }

    public void ligarCarro() {
        motor.ligar();
    }

    public void desligarCarro() {
        motor.desligar();
    }

    public void apresentarCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.apresentarMotor();
    }


}