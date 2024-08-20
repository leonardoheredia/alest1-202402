package aula05_recursao;

import utils.ArrayUtils;

public class Exercicios {

    public static int maiorValor(int[] a, int i, int maior) {
        //fazer
        int tamanho = a.length;
        if(i < tamanho) {
            if(a[i] > maior) maior = a[i];
            maiorValor(a, i + 1, maior);
        }
        return maior;
    }
    public static int maiorValorNaoRecursivo(int[] a) {
        int maiorValor = Integer.MIN_VALUE;
        int tamanho = a.length;
        for (int i = 0; i < tamanho; i++) {
            if(a[i] > maiorValor) {
                maiorValor = a[i];
            }
        }
        return maiorValor;
    }

    public static void inverter(int[] a) {
        inverter(a, 0);
    }

    private static void inverter(int[] a, int i) {
        int tamanho = a.length;
        if( i < (tamanho/2) ) {
            int temp = a[i];
            a[i] = a[tamanho - 1 - i];
            a[tamanho - 1 - i] = temp;
            inverter(a, i+1);
        }
    }

    public static void inverterNaoRecursivo(int[] a) {
        int tamanho = a.length;
        for (int i = 0; i < (tamanho / 2); i++) {
            int temp = a[i];
            a[i] = a[tamanho - 1 - i];
            a[tamanho - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {15,22,37,80,18,99};
        ArrayUtils.imprimir(a);
        inverterNaoRecursivo(a);
        ArrayUtils.imprimir(a);

        int[] b = {15,22,37,80,18,99};
        ArrayUtils.imprimir(b);
        inverter(b);
        ArrayUtils.imprimir(b);

        int x = maiorValor(b, 0, Integer.MIN_VALUE);
        System.out.println(x);

        /*
        int s = somatorio(4);
        System.out.println(s);

        s = somatorioNaoRecursivo(4);
        System.out.println(s);

        s = fatorialNaoRecursivo(5);
        System.out.println(s);

         */
    }

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


}
