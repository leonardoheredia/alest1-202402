package aula25_arvore_binaria_pesquisa;

public class ArvoreBinariaPesquisa {
    private class Nodo {
        private int chave;
        private Nodo esquerda;
        private Nodo direita;
        private Nodo pai;
        public Nodo(int chave) {
            this.chave = chave;
        }
    }
    private Nodo raiz;
    public ArvoreBinariaPesquisa() {};
    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if(estaVazia()) {
            raiz = n;
        }
        else {
            adicionarRecursivo(n, raiz);
        }
    }
    private void adicionarRecursivo(Nodo n, Nodo pai) {
        if(n.chave>pai.chave) {
            if(pai.direita==null) {
                pai.direita = n;
                n.pai = pai;
            }
            else adicionarRecursivo(n, pai.direita);
        }
        else {
            if(pai.esquerda==null) {
                pai.esquerda = n;
                n.pai = pai;
            }

            else adicionarRecursivo(n, pai.esquerda);
        }
    }
    public boolean remover(int chave) {
        //retorna TRUE se removeu ou FALSE se nao removeu (nao existia a chave)
        Nodo n = obterNodoRecursivo(chave, raiz);
        if(n==null) return false;
        if(numeroFilhos(n)==0) {
            if(n.pai.esquerda==n) n.pai.esquerda = null;
            else n.pai.direita = null;
        }
        return true;
    }
    private int numeroFilhos(Nodo n) {
        if(n==null) return -1;
        if(n.esquerda==null && n.direita==null) return 0;
        if(n.esquerda!=null && n.direita!=null) return 2;
        return 1;
    }
    private Nodo obterNodoRecursivo(int chave, Nodo n) {
        if(n==null) return null;
        if(chave==n.chave) return n;
        if(chave>n.chave) return obterNodoRecursivo(chave, n.direita);
        if(chave<n.chave) return obterNodoRecursivo(chave, n.esquerda);
        return null;
    }
    public void imprimirArvore() {
        imprimirArvoreRecusivamente(raiz, 0);
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
    public boolean estaVazia() {
        return raiz==null;
    }

    private void percorrerRecursivamente(Nodo aux, String[] resultados) {
        if(aux==null) return;
        int tamanho = Integer.parseInt(resultados[0]);
        tamanho++;
        resultados[0] = String.valueOf(tamanho);
        resultados[1] = resultados[1] + " " + aux.chave;
        if(aux.esquerda!=null) percorrerRecursivamente(aux.esquerda, resultados);
        if(aux.direita!=null) percorrerRecursivamente(aux.direita, resultados);
    }
    //IMPLEMENTAR NA AULA DO DIA 04/11
    public int obterTamanho() {
        String[] resultados = new String[4];
        resultados[0] = "0";
        resultados[1] = "";
        percorrerRecursivamente(raiz, resultados);
        int tamanho = Integer.parseInt(resultados[0]);
        return tamanho;
    }
    public void limpar() {
        raiz = null;
    }
    public int obterRaiz() {
        if(!estaVazia()) return raiz.chave;
        return -1;
    }
    public int obterPai(int chave) {
        if(estaVazia()) return -1;
        if(chave==raiz.chave) return -1;
        Nodo aux = obterNodoRecursivo(chave, raiz);
        return aux.pai.chave;
    }
    public String percorrerPreOrdem() {
        String[] resultados = new String[4];
        resultados[0] = "0";
        resultados[1] = "";
        percorrerRecursivamente(raiz, resultados);
        String caminho = resultados[1];
        return caminho;

    }
    public String percorrerPosOrdem() {
        return null;
    }
    public String percorrerCentral() {
        return null;
    }
    public String percorrerLargura() {
        return null;
    }
    public int obterNivel(int chave) {
        return 0;
    }
    public int obterAltura(int chave) {
        return 0;
    }
    public boolean ehInterno(int chave) {
        return false;
    }
    public boolean ehExterno(int chave) {
        return false;
    }


}
