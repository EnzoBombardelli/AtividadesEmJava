package Herança;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplina='" + disciplina + '\'' +
                '}' + super.toString();
    }
    public void apresentarProfessor(){
        super.apresentarFuncionario();
        System.out.println("Disciplina: " + disciplina);
    }
}
