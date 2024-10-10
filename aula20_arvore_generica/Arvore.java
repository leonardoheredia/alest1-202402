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
    public void adicionarFilho(String rotulo) {
        Nodo filho = new Nodo(rotulo);
        raiz.adicionarFilho(filho);
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
