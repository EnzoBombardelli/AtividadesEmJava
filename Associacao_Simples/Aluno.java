package Associacao_Simples;

public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void apresentarAluno(){
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);

        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
            System.out.println("Carga horária: " + curso.getCargaHoraria());
        } else {
            System.out.println("O aluno não está mtrículado em nenhum curso!");
        }
    }

    public void matricularNoCurso(Curso curso) {
        if (curso != null) {
            this.curso = curso;
            System.out.println("Carga horária: " + curso.getCargaHoraria());
        } else {
            System.out.println("O aluno não está mtrículado em nenhum curso!");
        }
    }
}
