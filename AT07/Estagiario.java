package AT07;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, int matricula, double salarioBase, String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        if (instituicaoEnsino == null || instituicaoEnsino.trim().isEmpty()) {
            throw new IllegalArgumentException("A instituição de ensino não pode ficar vazia.");
        }
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

    @Override
    public void apresentarDados() {
        System.out.println("Cargo: Estagiário");
        super.apresentarDados();
        System.out.println("Instituição de Ensino: " + instituicaoEnsino);
    }

    public void realizarTreinamento() {
        System.out.println("O estagiário " + getNome() + " está participando de um treinamento.");
    }
}