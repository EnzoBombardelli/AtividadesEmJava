package Heranca0;

public class Principal {
    public static void main(String[] args) {
        ContaPF contaPessoaFisica = new ContaPF("Enzo", 1001, 10000.00, "12345678900");
        ContaPJ contaPessoaJuridica =  new ContaPJ("Maria", 2001, 20000.00, "00.123.123/0001-45");

        System.out.println("---------------");
        contaPessoaFisica.depositar(500.00);
        contaPessoaFisica.sacar(300.00);
        contaPessoaFisica.mostrarDados();
        System.out.println("---------------");
        contaPessoaJuridica.depositar(5000.00);
        contaPessoaJuridica.sacar(1000.00);
        contaPessoaJuridica.mostrarDados();
    }
}
