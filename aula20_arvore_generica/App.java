package aula20_arvore_generica;

public class App {
    public static void main(String[] args) {
        Arvore t = new Arvore("R");
        t.adicionarFilho("Z");
        t.adicionarFilho("K");
        t.adicionarFilho("P");
        System.out.println(t);
    }
}
