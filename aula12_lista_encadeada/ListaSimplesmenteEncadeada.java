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
    private int quantidade;

    public ListaSimplesmenteEncadeada() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public void adicionar(String item) {
        Nodo n = new Nodo(item);
        if(quantidade==0) {
            inicio = n;
            fim = n;
        }
        else {
            fim.proximo = n;
            fim = n;
        }
        quantidade++;
    }

    public boolean existe(String item) {
        Nodo aux = inicio;
        while (aux!=null) {
            if(aux.item.equals(item)) return true;
            aux = aux.proximo;
        }
        return false;
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
        return sb.toString();
    }
}
