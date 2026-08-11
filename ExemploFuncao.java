public class ExemploFuncao {
    public static void main(String[] args) {
        String mensagem = mostrarMensagem(1);
        System.out.println(mensagem);
    }
    public static String mostrarMensagem(int a){
        if ( a == 1 ) {
            return "Boa noite!";
        }else {
            return "Bom dia!";
        }
    }
}
