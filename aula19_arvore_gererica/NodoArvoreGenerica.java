package aula19_arvore_gererica;

public class NodoArvoreGenerica {
    String item;
    NodoArvoreGenerica pai;
    NodoArvoreGenerica primeiroFilho;
    NodoArvoreGenerica irmao;

    public NodoArvoreGenerica(String item) {
        this.item = item;
        this.pai = null;
        this.primeiroFilho = null;
        this.irmao = null;
    }

    public void adicionarFilho(String item) {
        NodoArvoreGenerica n = new NodoArvoreGenerica(item);
        if(this.primeiroFilho==null) this.primeiroFilho = n;
        else {
            NodoArvoreGenerica aux = this.primeiroFilho;
            while (aux.irmao!=null) aux = aux.irmao;
            aux.irmao = n;
            aux.pai = this;
        }
    }
}
