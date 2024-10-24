package aula22_arvore_binaria_pesquisa;

public class App {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa();
        abp.adicionar(500);
        abp.adicionar(320);
        abp.adicionar(112);
        abp.adicionar(100);
        abp.adicionar(400);
        abp.adicionar(900);
        abp.adicionar(600);
        abp.adicionar(750);

        abp.imprimirArvore();
        System.out.println("");
        String caminhoPreOrdem = abp.preOrdem();
        System.out.println(caminhoPreOrdem);
    }
}
