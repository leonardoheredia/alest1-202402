package aula13_lista_duplamente_encadeada;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada times = new ListaDuplamenteEncadeada();
        //times.adicionar("internacional");
        //times.adicionar("gremio");
        //times.adicionar("juventude");
        //times.adicionar("caxias");
        //System.out.println(times);

        times.limpar();
        times.adicionar(0, "internacional");
        System.out.println(times);

        times.adicionar(0, "gremio");
        times.adicionar(0, "juventude");
        times.adicionar(0, "caxias");
        times.adicionar(4, "saojose");
        times.adicionar(5, "flamengo");
        times.adicionar(0, "palmeiras");
        System.out.println(times);

        times.adicionar(1, "atetico-mg");
        System.out.println(times);

        times.adicionar(4, "cruzeiro");
        System.out.println(times);


    }
}
