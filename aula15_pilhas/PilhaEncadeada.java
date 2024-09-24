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
    public String desempilhar() {
        //retorna o item que esta no topo da pilha
        //faz o topo receber o proximo
        if(topo==null) return null;
        String item = topo.item;
        topo = topo.proximo;
        quantidade--;
        return item;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo aux = topo;
        if(aux==null) sb.append("Pilha está vazia.");
        while (aux!=null) {
            sb.append(aux.item).append(System.lineSeparator());
            aux = aux.proximo;
        }
        return sb.toString();
    }

}
