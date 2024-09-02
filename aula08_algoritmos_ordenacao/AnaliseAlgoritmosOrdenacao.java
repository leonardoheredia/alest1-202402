package aula08_algoritmos_ordenacao;

import utils.ArrayUtils;

public class AnaliseAlgoritmosOrdenacao {

    public static void main(String[] args) {
        final int LIMITE_INFERIOR = 100;
        final int LIMITE_SUPERIOR = 1_000;
        final int INCREMENTO = 50;

        int[] meuArray;
        int[] meuArrayBubble;

        System.out.println("n;bubble");
        for (int n = LIMITE_INFERIOR; n <= LIMITE_SUPERIOR; n += INCREMENTO) {
            meuArray = new int[n];
            meuArrayBubble = new int[n];

            ArrayUtils.preencherArrayComValoresInteirosAleatorios(meuArray, 1_000_000, true);

            ArrayUtils.clonarArray(meuArray, meuArrayBubble);

            BubbleSort bs = new BubbleSort();
            bs.ordenar(meuArrayBubble);


            System.out.println(n + ";" + bs.getOperacoes());

        }
    }
}