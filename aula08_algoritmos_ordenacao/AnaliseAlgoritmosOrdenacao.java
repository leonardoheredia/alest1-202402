package aula08_algoritmos_ordenacao;

import utils.ArrayUtils;

public class AnaliseAlgoritmosOrdenacao {

    public static void main(String[] args) {
        final int LIMITE_INFERIOR = 100;
        final int LIMITE_SUPERIOR = 1_000;
        final int INCREMENTO = 50;

        int[] meuArray;
        int[] meuArrayBubble;

        System.out.println("n;algorimot");
        for (int n = 5; n <= 100; n += 1) {
            meuArray = new int[n];
            meuArrayBubble = new int[n];

            ArrayUtils.preencherArrayComValoresInteirosAleatorios(meuArray, 1_000_000, true);

            ArrayUtils.clonarArray(meuArray, meuArrayBubble);

            BubbleSort bs = new BubbleSort();
            bs.ordenar(meuArrayBubble);
            //InsertionSort is = new InsertionSort();
            //is.ordenar(meuArray);

            System.out.println(n + ";" + bs.getOperacoes());




            /*
            ArrayUtils.clonarArray(meuArray, meuArrayBubble);

            BubbleSort bs = new BubbleSort();
            bs.ordenar(meuArrayBubble);


*/
        }
    }
}