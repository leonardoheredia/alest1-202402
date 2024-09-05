package aula08_algoritmos_ordenacao;

import utils.ArrayUtils;

public class AnaliseAlgoritmosOrdenacao {

    public static void main(String[] args) {
        final int LIMITE_INFERIOR = 100;
        final int LIMITE_SUPERIOR = 1_000;
        final int INCREMENTO = 50;

        int[] meuArray;
        int[] meuArrayBubble;
        int[] meuArrayMerge;
        int[] meuArrayQuick;

        System.out.println("n;bubble;merge;quick");
        for (int n = 1_000; n <= 10_000; n += 500) {
            meuArray = new int[n];
            meuArrayBubble = new int[n];
            meuArrayMerge = new int[n];
            meuArrayQuick = new int[n];

            ArrayUtils.preencherArrayComValoresInteirosAleatorios(meuArray, 1_000_000, true);

            ArrayUtils.clonarArray(meuArray, meuArrayBubble);
            ArrayUtils.clonarArray(meuArray, meuArrayMerge);
            ArrayUtils.clonarArray(meuArray, meuArrayQuick);

            BubbleSort bs = new BubbleSort();
            bs.ordenar(meuArrayBubble);

            MergeSort ms = new MergeSort();
            ms.ordenar(meuArrayMerge);

            QuickSort qs = new QuickSort();
            qs.ordenar(meuArrayQuick);

            System.out.println(n + ";" + bs.getOperacoes() + ";" + ms.getOperacoes() + ";" + qs.getOperacoes());

        }
    }
}