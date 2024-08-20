package aula05_recursao;

public class Exercicios {
    public static int somatorio(int n) {
        if(n == 0) return 0;
        else return n + somatorio(n-1);
    }

    public static int somatorioNaoRecursivo(int n) {
        int soma = 0;
        for (int i = n; i > 0; i--) {
            soma = soma + i;
        }
        return soma;
    }

    public static int fatorialNaoRecursivo(int n) {
        int fatorial = 1;
        for (int i = n; i > 0; i--) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int s = somatorio(4);
        System.out.println(s);

        s = somatorioNaoRecursivo(4);
        System.out.println(s);

        s = fatorialNaoRecursivo(5);
        System.out.println(s);
    }

}
