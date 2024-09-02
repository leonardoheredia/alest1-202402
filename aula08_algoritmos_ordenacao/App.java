package aula08_algoritmos_ordenacao;

import utils.ArrayUtils;

public class App {
    public static void main(String[] args) {
        int[] b = {80, 50, 67, 71, 88};
        ArrayUtils.imprimir(b);
        ordenarBubble(b);
        ArrayUtils.imprimir(b);

    }
    public static void ordenarBubble(int[] a) {
        int tamanho = a.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1 - i ; j++) {
                if(a[j] > a[j + 1]) {
                    System.out.println("Trocou o " + a[j] + " pelo " + a[j+1]);
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    ArrayUtils.imprimir(a);
                }
            }
        }

    }


}

