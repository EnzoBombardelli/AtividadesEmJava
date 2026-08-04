public class AT02_Exercicio4 {
    public static void main(String[] args) {
        String filme = mostrarFilme("Homem-Aranha: Um novo dia", "Herói", 2026);
        System.out.println(filme);

        int idade = idadeFilme(2026);
        System.out.println("Idade do filme: " + idade + " anos");

        String classificacao = classificarFilme(idade);
        System.out.println("Classificção: " + classificacao);
    }
    public static String mostrarFilme(String nome, String genero, int lancamento) {
        return "Nome: " + nome + "\nGênero: " + genero + "\nLançamento: " + lancamento;
    }
    public static int idadeFilme(int lancamento) {
        return 2026 - lancamento;
    }
    public static String classificarFilme(int idade) {
        if (idade <= 2) {
            return "Lançamento";
        } else if (idade <= 10) {
            return "Recente";
        } else {
            return "Clássico";
        }

    }

}
