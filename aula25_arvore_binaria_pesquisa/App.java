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
        abp.imprimirArvore();

        abp.remover(900);
    }
}
