package AT10.Agregacao;

public class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        setNome(nome);
        setDisciplina(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: nome do professor não pode ser vazio.");
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.trim().isEmpty()) {
            this.disciplina = disciplina;
        } else {
            System.out.println("Erro: disciplina não pode ser vazia.");
        }
    }

    public void apresentarProfessor() {
        System.out.println("Professor: " + nome + " | Disciplina: " + disciplina);
    }
}