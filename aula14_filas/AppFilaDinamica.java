package aula14_filas;

public class AppFilaDinamica {
    public static void main(String[] args) {
        FilaDinamica fd = new FilaDinamica();
        fd.enfileirar("carlos");
        fd.enfileirar("maria");
        fd.enfileirar("jose");
        fd.enfileirar("antonio");
        System.out.println(fd);
        System.out.println(fd.desenfileirar());
        System.out.println(fd);
    }
}
