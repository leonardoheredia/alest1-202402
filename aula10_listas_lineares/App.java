package aula10_listas_lineares;

public class App {
    public static void main(String[] args) {
        ListaLinearEstatica lista = new ListaLinearEstatica();
        lista.adicionar("Mariana");
        lista.adicionar("Francisco");
        lista.adicionar("Alexandre");
        lista.adicionar("Carlos");
        lista.adicionar("Leandro");
        lista.adicionar("Lucas");
        lista.adicionar("Tales");

        System.out.println(lista);
    }
}
