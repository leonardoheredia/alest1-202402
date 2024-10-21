package aula19_arvore_gererica;

public class ArvoreGenericaEncadeada {
    private class Nodo {
        String item;
        Nodo primeiroFilho;
        Nodo irmao;
        public Nodo(String item) {
            this.item = item;
        }
    }

    Nodo raiz;
    public ArvoreGenericaEncadeada(String item) {
        Nodo n = new Nodo(item);
        raiz = n;
    }
    public void adicionar(String pai, String filho) {
        Nodo nodoFilho = new Nodo(filho);
        Nodo aux = raiz;
        if(aux.primeiroFilho==null) aux.primeiroFilho = nodoFilho;
    }

    public Nodo buscarNodo(String item) {
        return buscarNodoRecursivo(item, raiz);
    }

    private Nodo buscarNodoRecursivo(String item, Nodo n) {
        if(n==null) return null;
        if(n.item.equals(item)) return n;
        else {
            Nodo aux = n.primeiroFilho;
            while(aux!=null) {
                buscarNodoRecursivo(item, aux);
                aux = aux.irmao;
            }
        }
        return null;
    }



    public String preOrdem() {
        preOrdemRecursivo(raiz);
        return "";
    }
    private String preOrdemRecursivo(Nodo pai) {
        System.out.println(pai.item);
        Nodo aux = pai;
        if(aux.primeiroFilho!=null) preOrdemRecursivo(aux.primeiroFilho);
        if(aux.irmao!=null) preOrdemRecursivo(aux.irmao);
        return "";
    }
}
