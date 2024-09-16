package aula13_lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada {
    private class Nodo {
        String item;
        Nodo anterior;
        Nodo proximo;
        public Nodo(String item) {
            this.item = item;
            anterior = null;
            proximo = null;
        }
    }
    private int tamanho;
    private Nodo inicio;
    private Nodo fim;

    public ListaDuplamenteEncadeada() {
        //cria inicio e fim como sentinelas
        inicio = new Nodo(null);
        fim = new Nodo(null);
        inicio.proximo = fim;
        fim.anterior = inicio;

        tamanho = 0;
    }
    public void adicionar(int posicao, String item) {
        if(posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        Nodo n = new Nodo(item);

        Nodo aux = inicio.proximo;
        for (int p = 0; p < posicao; p++) {
            aux = aux.proximo;
        }
        //aux referencia o nodo na posicao em que queremos adicionar
        n.proximo = aux;
        n.anterior = aux.anterior;
        aux.anterior.proximo = n;
        aux.anterior = n;

        tamanho++;
    }

    public void adicionar(String item) {
        //por default adiciona no final da lista
        //IMPLEMENTAR
    }

    public void limpar() {
        inicio.proximo = fim;
        fim.anterior = inicio;
        tamanho = 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for(Nodo aux = inicio.proximo; aux!=fim; aux = aux.proximo) {
            sb.append(aux.item).append(" ");
        }
        sb.append("}").append(" tamanho = ").append(tamanho);
        if(tamanho>1) {
            sb.append(" inicio = ").append(inicio.proximo.item);
            sb.append(" fim = ").append(fim.anterior.item);
        }
        return sb.toString();
    }
}
