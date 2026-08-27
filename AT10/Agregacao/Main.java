package AT10.Agregacao;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ana Silva", "História");
        Escola escola1 = new Escola("Instituto Educação", "Centro", "Particular", professor1);
        escola1.apresentarEscola();
    }
}