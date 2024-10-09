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
    public void desempilhar() {
        if(estaVazia()) return;
        topo = topo.proximo;
        quantidade--;
    }
    public void empilhar(String item) {
        Nodo n = new Nodo(item);
        n.proximo = topo;
        topo = n;
        quantidade++;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public boolean estaVazia() {
        return quantidade==0;
    }
    public String getTopo() {
        if(estaVazia()) return null;
        return topo.item;
    }
    public void limpar() {
        topo = null;
        quantidade = 0;
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
