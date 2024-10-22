package aula22_arvore_binaria_pesquisa;

public class ArvoreBinariaPesquisa {
    private class Nodo {
        private int chave;
        private Nodo esquerda;
        private Nodo direita;
        public Nodo(int chave) {
            this.chave = chave;
        }
    }
    private Nodo raiz;

    public ArvoreBinariaPesquisa() {};
    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if(raiz==null) {
            raiz = n;
        }
        else {
            adicionarRecursivo(n, raiz);
        }
    }
    private void adicionarRecursivo(Nodo n, Nodo pai) {
        if(n.chave > pai.chave) { //descer para a DIREITA
            if(pai.direita==null) pai.direita = n;
            else adicionarRecursivo(n, pai.direita);
        }
        else {
            if(pai.esquerda==null) pai.esquerda = n;
            else adicionarRecursivo(n, pai.esquerda);
        }
    }

    /*
    public void imprimirArvore() {
        imprimirArvoreRecusivamente(this.raiz, 0);
    }
    private void imprimirArvoreRecusivamente(Nodo raiz, int nivel) {
        if (raiz == null) return;
        nivel += 5;
        imprimirArvoreRecusivamente(raiz.direita, nivel);
        System.out.print("\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        System.out.print(raiz.chave + "\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        imprimirArvoreRecusivamente(raiz.esquerda, nivel);
    }

     */
}
