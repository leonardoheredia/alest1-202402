package aula08_algoritmos_ordenacao;

import utils.ArrayUtils;

public class App {
    public static void main(String[] args) {
        int[] b = {80, 50, 67, 71, 88};
        ArrayUtils.imprimir(b);
        ordenarBubble(b);
        ArrayUtils.imprimir(b);

        //teste do merge ordenado
        int[] a1 = {23, 56, 90, 99};
        int[] b1 = {45, 98, 120, 180, 200};

        int[] m = merge(a1, b1);
        ArrayUtils.imprimir(m);

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

    public static int[] merge(int[] a, int[] b) {
        int na = a.length;
        int nb = b.length;
        int[] m = new int[na + nb];

        int i = 0, j = 0, k = 0;
        while (i < na && j < nb) {
            if (a[i] <= b[j]) {
                m[k] = a[i];
                k++;
                i++;
            }
            else {
                m[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < na) {
            m[k] = a[i];
            k++;
            i++;
        }

        while (j < nb) {
            m[k] = b[j];
            k++;
            j++;
        }

        return m;
    }

}

