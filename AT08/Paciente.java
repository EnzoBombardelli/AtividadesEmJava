package AT08;

public class Paciente {
    private String nome;
    private int idade;
    private String cpf;

    public Paciente(String nome1, int idade, String cpf) {
        this.nome = nome1;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void apresentarPaciente(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    public void realizarConsulta(Medico medico){
        System.out.println("Nome Paciente: " + nome);
        System.out.println("Nome Médico: " + medico.getNome());
        System.out.println("Especialidade: " + medico.getEspecialidade());
    }
}