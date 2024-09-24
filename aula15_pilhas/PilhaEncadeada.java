package aula15_pilhas;

public class PilhaEncadeada {
    private class Nodo {
        private String item;
        private Nodo proximo;
        public Nodo(String item) {
            this.item = item;
            this.proximo = null;
        }
    }
    private Nodo topo;
    private int quantidade;
    public PilhaEncadeada() {
        topo = null;
        quantidade = 0;
    }
    public void empilhar(String item) {
        Nodo n = new Nodo(item);
        n.proximo = topo;
        topo = n;
        quantidade++;
    }
    public void imprimir() {
        //percorrer toda a pilha imprimindo cada elemento
        //inicializar uma variavel aux do tipo Nodo com valor inicial igual
        //ao topo
        //enquanto aux for diferente de null imprimir o aux.item

    }





}
