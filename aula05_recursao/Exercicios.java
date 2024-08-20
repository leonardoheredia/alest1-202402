package aula05_recursao;

public class Exercicios {
    public static int somatorio(int n) {
        if(n == 0) return 0;
        else return n + somatorio(n-1);
    }

    public static void main(String[] args) {
        int s = somatorio(4);
        System.out.println(s);
    }

}
