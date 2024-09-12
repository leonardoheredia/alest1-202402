package aula12_lista_encadeada;

public class App {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        lista.adicionar("Guilherme");
        lista.adicionar("Mauricio");
        lista.adicionar("Amanda");
        lista.adicionar("Joao");
        System.out.println(lista);

        System.out.println(lista.existe("Amanda"));
        System.out.println(lista.existe("Lucas"));
    }
}
