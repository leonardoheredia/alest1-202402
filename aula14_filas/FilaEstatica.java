package aula14_filas;

public class FilaEstatica {
    private int capacidade;
    private int tamanho;
    private String[] itens;
    private int inicio;
    private int fim;

    public FilaEstatica() {
        capacidade = 10;
        tamanho = 0;
        inicio = 0;
        fim = -1;
        itens = new String[capacidade];
    }

    public void enfileirar(String item) {
        //insere SEMPRE no final da fila
        //final da fila sera fim+1;
        int posicao = fim + 1;
        itens[posicao] = item;
        fim = posicao;
        tamanho++;
    }
    public boolean estaVazia() {
        return (tamanho==0);
    }

    public String desenfileirar() {
        if(estaVazia()) {
            return null;
        }
        String r = itens[inicio];
        itens[inicio] = null;
        inicio++;
        tamanho--;
        return r;
    }

    public String imprimirArray() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < capacidade; i++) {
            sb.append(itens[i]).append(" ");
        }
        sb.append("] ");
        return sb.toString();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = inicio; i <= fim; i++) {
            sb.append(itens[i]).append(" ");
        }
        sb.append("}");
        return sb.toString();
    }
}
