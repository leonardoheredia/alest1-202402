package aula14_filas;

public class FilaEstatica {
    private int capacidade;
    private int tamanho;
    private String[] itens;
    private int inicio;
    private int fim;
    public FilaEstatica() {
        capacidade = 4;
        tamanho = 0;
        inicio = 0;
        fim = -1;
        itens = new String[capacidade];
    }
    public void enfileirar(String item) {
        //insere SEMPRE no final da fila
        //final da lista sera fim+1;
        int posicao = fim + 1;
        itens[posicao] = item;
        fim = posicao;
        tamanho++;
    }
    public String desenfileirar() {
        String r = itens[inicio];
        itens[inicio] = null;
        inicio++;
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
