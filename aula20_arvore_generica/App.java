package aula20_arvore_generica;

public class App {
    public static void main(String[] args) {
        Arvore t = new Arvore("R");
        t.adicionarFilho("R", "Z");
        t.adicionarFilho("R","K");
        t.adicionarFilho("R", "P");;
        System.out.println(t);
    }
}
