public class AT03_Exercicio3 {
    static void main() {
        int[] n = new int[8];

        n[0] = 43;
        n[1] = 75;
        n[2] = 22;
        n[3] = 15;
        n[4] = 33;
        n[5] = 67;
        n[6] = 28;
        n[7] = 95;

        int maiorNumero = n[0];
        int menorNumero = n[0];

        for(int i = 0; i < n.length; i++){
            if (n[i] > maiorNumero){
                maiorNumero = n[i];
            }
            if (n[i] < menorNumero){
                menorNumero = n[i];
            }
        }
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
    }

}
