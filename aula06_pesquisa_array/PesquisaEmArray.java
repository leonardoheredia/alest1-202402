package aula06_pesquisa_array;

public class PesquisaEmArray {
    public static boolean pesquisaLinear(int[] a, int chave) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == chave) return true;
        }
        return false;
    }

    public static boolean pesquisaBinaria(int[] a, int chave, int inicio, int fim) {
        if(inicio > fim) return false;
        int meio = (inicio + fim)  / 2;
        if(chave==a[meio]) return true;
        else if(chave > a[meio]) {
            inicio = meio + 1;
            return pesquisaBinaria(a, chave, inicio, fim);
        }
        else {
            fim = meio - 1;
            return pesquisaBinaria(a, chave, inicio, fim);
        }

    }



    /*
    public static boolean pesquisaBinaria(int a[], int chave, int inicio, int fim) {

        if(inicio>fim) return false;

        int meio = (inicio + fim) / 2;

        if(chave==a[meio]) return true;
        else if(chave>a[meio]) {
            inicio = meio + 1;
            return pesquisaBinaria(a, chave, inicio, fim);
        }
        else {
            fim = meio - 1;
            return pesquisaBinaria(a, chave, inicio, fim);
        }

    }
    */

    public static void main(String[] args) {
        int[] a = {15,20,23,26,28,32,37,40};
        int chave = 39;
        System.out.println("Pesquisando o " + chave);
        boolean b = pesquisaBinaria(a, chave, 0, a.length - 1);
        System.out.println(b);

    }
}
