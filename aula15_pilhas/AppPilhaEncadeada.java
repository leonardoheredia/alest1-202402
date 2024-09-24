package aula15_pilhas;

import javax.swing.plaf.SpinnerUI;

public class AppPilhaEncadeada {
    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.empilhar("sapiens");
        pilha.empilhar("1822");
        pilha.empilhar("gaia");
        System.out.println(pilha);
        pilha.desempilhar();
        System.out.println(pilha);
        pilha.desempilhar();
        System.out.println(pilha);
        pilha.desempilhar();
        pilha.desempilhar();
        System.out.println(pilha);
    }
}
