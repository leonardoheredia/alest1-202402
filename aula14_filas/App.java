package aula14_filas;

public class App {
    public static void main(String[] args) {
        FilaEstatica f = new FilaEstatica();
        f.enfileirar("noteboook");
        f.enfileirar("impressora");
        f.enfileirar("mouse");
        System.out.println(f.imprimirArray());
        System.out.println(f);
        System.out.println(f.desenfileirar());
        System.out.println(f.imprimirArray());
        System.out.println(f);
        System.out.println(f.desenfileirar());
        System.out.println(f);
    }
}
