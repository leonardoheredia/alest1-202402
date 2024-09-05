package aula10_listas_lineares;

public class ListaLinearEstatica {
    private int capacidade;
    private int tamanho;
    private String[] itens;

    public ListaLinearEstatica() {
        capacidade = 5;
        itens = new String[capacidade];
        tamanho = 0;
    }
    public void adicionar(String item) {
        if(tamanho<capacidade) {
            itens[tamanho] = item;
            tamanho++;
        }
        else {
            //chegou na capacidade
            //entao vou DUPLICAR O TAMANHO DO ARRAY
            capacidade = capacidade * 2;
            String[] novoItens = new String[capacidade];
            //copiar todos os elemntos para o novo array
            for (int i = 0; i < tamanho; i++) {
                novoItens[i] = itens[i];
            }
            novoItens[tamanho] = item;
            tamanho++;
            itens = novoItens;
        }
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < tamanho; i++) {
            s = s + itens[i] + System.lineSeparator();
        }
        return s;
    }
}
