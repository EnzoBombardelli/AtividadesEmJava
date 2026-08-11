public class AT03_Exercicio2 {
    public static void main(String[] args) {
        int[] n = new int[6];
        int soma = 0;
        n[0] = 2;
        n[1] = 11;
        n[2] = 8;
        n[3] = 7;
        n[4] = 22;
        n[5] = 8;

        for (int i = 0; i < n.length; i++){
            soma += n[i];
        }
        System.out.println("Soma: " + soma);
    }
}
