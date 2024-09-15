package aula12_lista_encadeada;

public class App {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada l = new ListaSimplesmenteEncadeada();
        l.adicionar("leite");
        l.adicionar("maca");
        l.adicionar("pirulito");
        System.out.println(l);
        l.remover("maca");
        System.out.println(l);
        l.remover("leite");
        System.out.println(l);
        l.remover("pirulito");
        System.out.println(l);

        l.adicionar("mariana");
        l.adicionar("leonardo");
        l.adicionar("francisco");
        System.out.println(l);
        l.remover("francisco");
        System.out.println(l);

        l.adicionar("lucas");
        System.out.println(l);

        l.remover("mariana");
        System.out.println(l);

        l.remover("leonardo");
        System.out.println(l);

        l.remover("");
        System.out.println(l);
        l.remover("lucas");
        System.out.println(l);

        l.adicionar("mariana");
        l.adicionar("leonardo");
        l.adicionar("francisco");
        System.out.println(l);
        l.adicionar(0,"alexandre");
        System.out.println(l);
        l.adicionar(0,"tales");
        System.out.println(l);
        l.adicionar(3,"leandro");
        System.out.println(l);
        l.adicionar(6, "helena");
        System.out.println(l);

        l.limpar();
        System.out.println(l);
        l.adicionar("alexandre");
        System.out.println(l);

    }
}
