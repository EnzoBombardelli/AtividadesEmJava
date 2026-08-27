package Outros.modelo;

public class TesteMesmoPacote {
    public void realizarTeste(){
        Funcionario f = new Funcionario(3500, "Enzo Bombardelli", 1234, "UniFil");
        System.out.println(f.empresa);
        System.out.println(f.nome);
        System.out.println(f.codigoInterno);
        f.apresentarCodigoInterno();
        System.out.println(f.getSalario());
        f.apresentarSalarioConfidencial();
    }
}
