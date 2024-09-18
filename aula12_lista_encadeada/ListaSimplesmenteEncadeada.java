package aula12_lista_encadeada;

public class ListaSimplesmenteEncadeada {

    private class Nodo {
        String item;
        Nodo proximo;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public ListaSimplesmenteEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionar(String item) {
        //por default adiciona no final da lista
        Nodo n = new Nodo(item);
        if(tamanho ==0) {
            inicio = n;
            fim = n;
        }
        else {
            fim.proximo = n;
            fim = n;
        }
        tamanho++;
    }

    public boolean existe(String item) {
        Nodo aux = buscarNodo(item);
        return aux!=null;
    }

    public int buscar(String item) {
        int p = 0;
        for(Nodo n = inicio; n!=null; n = n.proximo) {
            if(n.item.equals(item)) return p;
            p++;
        }
        return -1; //nao existe
    }

    public String buscar(int posicao) {
        int p = 0;
        for(Nodo n = inicio; n!=null; n = n.proximo) {
            if(p == posicao) return n.item;
        }
        return null;
    }

    //public String buscar
    private Nodo buscarNodo(String item) {
        Nodo aux = inicio;
        while(aux!=null) {
            if(aux.item.equals(item)) return aux;
        }
        return null;
    }

    public void remover(String item) {
        Nodo anterior = inicio;
        for (Nodo r = inicio; r!=null; r = r.proximo) {
            if(r.item.equals(item)) { //achou o nodo a remover
                anterior.proximo = r.proximo;
                if(r==inicio) inicio = r.proximo;
                if(r==fim) fim = anterior;
                tamanho--;
                return;
            }
            anterior = r;
        }
    }

    public boolean estaVazia() {
        return tamanho==0;
    }

    public void adicionar(int posicao, String item) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posicao invalida");
        }
        //adicionar em uma posicao especifica
        Nodo n = new Nodo(item);

        if(posicao==0) { //inserindo no inicio
            n.proximo = inicio;
            inicio = n;
            if(tamanho==0) fim = n; //verifica tb o fim
        }
        else if(posicao==tamanho) {
            //permite inserir no final
            fim.proximo = n;
            fim = n;
        }
        else {
            Nodo anterior = inicio;
            for(int p=0; p<posicao; p++) {
                anterior = anterior.proximo;
            }
            //termina o laco com o anterior sendo o anterior do novo nodo
            //inserir
            n.proximo = anterior.proximo;
            anterior.proximo = n;
        }
        tamanho++;
    }

    public void limpar() {
        //limpa a lista
        tamanho = 0;
        inicio = null;
        fim = null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Nodo aux = inicio;
        while(aux!=null) {
            sb.append(aux.item).append(" ");
            aux = aux.proximo;
        }
        sb.append("}");
        if(!estaVazia()) {
            sb.append(" inicio = ").append(inicio.item).append(" fim = ").append(fim.item);
        }
        sb.append(" tam = ").append(tamanho);
        return sb.toString();
    }
}
