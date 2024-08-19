package aula05_recursao;

public class Exemplo {

    public static void main(String[] args) {
        escrever("O Inter ganhou!", 3);

    }

    public static void escrever(String mensagem, int n) {
        if(n>0) {
            System.out.println(mensagem);
            escrever(mensagem, n -1 );
        }
    }

/*
    public static void escrever(String mensagem, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(mensagem);
        }
    }
*/

}
