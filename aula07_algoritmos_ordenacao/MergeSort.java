package aula07_algoritmos_ordenacao;

import utils.ArrayUtils;

public class MergeSort {

    public void ordenar(int[] a) {
        mergeSort(a, 0, a.length-1);
    }
    public void mergeSort(int[] a, int i, int f) {
        if(i < f) {
            int m = (i + f) / 2;
            mergeSort(a, i, m);
            merge(a, i, m, f);
        }
    }
    public void merge(int[] a, int i, int m, int f) {
        int[] helper = new int[a.length];
        for (int j = i; j <= f; j++) {
            helper[j] = a[j];
        }
        ArrayUtils.imprimir(helper);
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        MergeSort ms = new MergeSort();
        ms.ordenar(a);
    }
}
