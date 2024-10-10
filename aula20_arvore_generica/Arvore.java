package aula20_arvore_generica;

public class Arvore {
    private class Nodo {
        private String rotulo;
        private Nodo[] filhos;
        private int numFilhos;
        public Nodo(String rotulo) {
            this.rotulo = rotulo;
            filhos = new Nodo[5];
        }
        public void adicionarFilho(Nodo filho) {
            filhos[numFilhos] = filho;
            numFilhos++;
        }
    }

    private Nodo raiz;
    public Arvore(String rotulo) {
        Nodo n = new Nodo(rotulo);
        raiz = n;
    }
    public void adicionarFilho(String rotuloPai, String rotuloFilho) {
        Nodo nodoFilho = new Nodo(rotuloFilho);
        Nodo nodoPai = buscarNodo(rotuloPai);
        nodoPai.adicionarFilho(nodoFilho);
    }
    private Nodo buscarNodo(String rotulo) {
        return buscarNodoRecursivo(this.raiz, rotulo);
    }
    private Nodo buscarNodoRecursivo(Nodo n, String rotulo) {
        if(n.rotulo.equals(rotulo)) return n;
        else {
            for (int i = 0; i < n.numFilhos; i++) {
                Nodo nodoEncontrado = buscarNodoRecursivo(n.filhos[i], rotulo);
                if(nodoEncontrado!=null) return nodoEncontrado;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Arvore").append(System.lineSeparator());
        sb.append(System.lineSeparator()).append("Nodo " + raiz.rotulo);
        sb.append(" Filhos { ");
        for (int i = 0; i < raiz.numFilhos; i++) {
            sb.append(raiz.filhos[i].rotulo + " ");
        }
        sb.append("}");
        return sb.toString();
    }
}
