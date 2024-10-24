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
        if(n.esquerda!=null) percorrerEmProfundidade(n.esquerda);
        System.out.println(n.chave);
        if(n.direita!=null) percorrerEmProfundidade(n.direita);
    }

    public void limpar() {
        //LIMPA A ARVORE
    }
    public boolean estaVazia() {
        //VERIFICA SE A ARVORE ESTA VAZIA
        return false;
    }
    public int obterRaiz() {
        //IMPLEMENTAR
        return  -1;
    }
    public int obterPai(int chave) {
        //RETORNA O VALOR DA CHAVE DO PAI DA CHAVE INFORMADA
        return -1;
    }
    public String preOrdem() {
        //retorna uma lista do caminho em preOrdem
        return null;
    }
    public String posOrdem() {
        //retorna uma lista do caminho em posOrdem
        return null;
    }
    public String ordemCentral() {
        //retorna uma lista do caminho em ordem central
        return null;
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
