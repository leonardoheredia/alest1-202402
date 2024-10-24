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
    private String preOrdem;
    private String posOrdem;
    private String ordemCentral;

    public ArvoreBinariaPesquisa() {
        raiz = null;
        preOrdem = "";
    };
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
        else { //descer para a ESQUERDA
            if(pai.esquerda==null) pai.esquerda = n;
            else adicionarRecursivo(n, pai.esquerda);
        }
    }

    public void percorrerEmProfundidade() {
        percorrerEmProfundidade(raiz);
    }
    private void percorrerEmProfundidade(Nodo n) {
        if(n==null) return;
        this.preOrdem = this.preOrdem + " " + n.chave;
        if(n.esquerda!=null) percorrerEmProfundidade(n.esquerda);
        if(n.direita!=null) percorrerEmProfundidade(n.direita);
    }

    public String preOrdem() {
        percorrerEmProfundidade();
        return this.preOrdem;
    }
    public String posOrdem() {
        //retorna uma lista do caminho em posOrdem
        return null;
    }
    public String ordemCentral() {
        //retorna uma lista do caminho em ordem central
        return null;
    }
    public void limpar() {
        raiz = null;
    }
    public boolean estaVazia() {
        return (raiz==null);
    }
    public int obterRaiz() {
        if(!estaVazia()) return raiz.chave;
        else return -1;
    }
    public int obterPai(int chave) {
        //RETORNA O VALOR DA CHAVE DO PAI DA CHAVE INFORMADA
        return -1;
    }

    public int obterAltura() {
        return -1;
    }
    public int ehInterno(int chave) {
        return -1;
    }
    public int ehFolha(int chave) {
        return -1;
    }
    public int obterTamanho() {
        //retorna o tamanho da arvore
        return -1;
    }
    public boolean existe(int chave) {
        //verifica se uma chave existe na arvore
        return false;
    }











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


}
