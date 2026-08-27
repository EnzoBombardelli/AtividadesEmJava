package AT10.Agregacao;

public class Escola {
    private String nome;
    private String localidade;
    private String tipo;

    // Variável que realiza o vínculo de AGREGAÇÃO entre Escola e Professor
    private Professor professor;

    // O construtor recebe o objeto Professor pronto criado fora da classe
    public Escola(String nome, String localidade, String tipo, Professor professor) {
        setNome(nome);
        setLocalidade(localidade);
        setTipo(tipo);
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        if (localidade != null && !localidade.trim().isEmpty()) {
            this.localidade = localidade;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void apresentarEscola() {
        System.out.println("=== Informações da Escola ===");
        System.out.println("Escola: " + nome);
        System.out.println("Localidade: " + localidade);
        System.out.println("Tipo: " + tipo);
        if (professor != null) {
            professor.apresentarProfessor();
        } else {
            System.out.println("Nenhum professor associado no momento.");
        }
    }
}