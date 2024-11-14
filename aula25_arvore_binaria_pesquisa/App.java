package aula25_arvore_binaria_pesquisa;

public class App {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa();
        abp.adicionar(48);
        abp.adicionar(20);
        abp.adicionar(87);
        abp.adicionar(53);
        abp.adicionar(90);
        abp.adicionar(89);
        abp.adicionar(93);
        abp.adicionar(10);
        abp.adicionar(30);
        abp.adicionar(25);
        abp.adicionar(32);
        System.out.println("");
        System.out.println("");
        abp.imprimirArvore();

        System.out.println("");
        System.out.println("Raiz = " + abp.obterRaiz());
        int c1 = 53;
        System.out.println("Pai do " + c1 + " = " + abp.obterPai(53));

        System.out.println("Tamanho = " + abp.obterTamanho());
        System.out.println("Preordem = " + abp.percorrerPreOrdem());

        System.out.println(abp.obterAltura(93));

        System.out.println(abp.contarNodos());
        System.out.println(abp.maiorValor());
    }
}
