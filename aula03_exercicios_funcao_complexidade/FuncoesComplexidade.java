package aula03_exercicios_funcao_complexidade;

public class FuncoesComplexidade {

    public static void main(String[] args) {
        System.out.println("n;alg_01;alg_02;alg_04;alg_05;alg_06");
        for (int n = 10; n < 500; n+=10) {
            System.out.println(n + ";" + alg_01(n) + ";" + alg_02(n) + ";" + alg_04(n) + ";" + alg_05(n) + ";" + alg_06(n));
        };

    }

    public static int alg_01(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++) {
            operacoes++;
        }
        operacoes = 3*operacoes+3;
        return operacoes;
    }

    public static int alg_02(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                operacoes++;
        return operacoes;
    }

    public static int alg_04(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < i + 2; j++)
                for (int k = 0; k < n; k++)
                    operacoes++;
        return operacoes;
    }

    public static int alg_05(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < 2 * i; j++)
                operacoes++;
        return operacoes;
    }

    public static long alg_06(int n) {
        long operacoes = 1;
        for (int i = 1; i <= n / 2; i++) {
            operacoes = operacoes * n;
            if (operacoes >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;

            }
        }
        return operacoes;
    }






}
