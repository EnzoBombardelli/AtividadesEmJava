package Associacao_Simples;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 88888);
        Curso curso = new Curso("Office", 160);

        Curso curso1 = new Curso("Java", 320);
        Aluno aluno1 = new Aluno("Enzo", 22222);
        System.out.println("Dados do aluno:");
        aluno.apresentarAluno();
        aluno.matricularNoCurso(curso);
        System.out.println("Dados do aluno após a matrícula.");
        aluno.apresentarAluno();
        System.out.println("---------------------------------");
        aluno.matricularNoCurso(curso1);
        aluno.apresentarAluno();
    }
}
