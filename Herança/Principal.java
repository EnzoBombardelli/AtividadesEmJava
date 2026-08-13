package Herança;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Enzo", 670.00);
        Professor p = new Professor("Marcelo", 3800.00, "Matemática");

        System.out.println(f);
        System.out.println(p);
        System.out.println("---------------------");
        f.apresentarFuncionario();
        p.apresentarProfessor();
        f.setSalario(5000);
        p.setSalario(6000);
        p.setDisciplina("Programação");
        System.out.println("---------------------");
        f.apresentarFuncionario();
        p.apresentarProfessor();
    }
}
