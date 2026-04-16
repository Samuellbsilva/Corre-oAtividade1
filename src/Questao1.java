public static int inserirOrdenadoDecrescente(int[] lista, int tamanhoLogico, int novoValor) {
    
    if (tamanhoLogico >= lista.length) {
        return tamanhoLogico;
    }

    int posicaoInsercao = 0;
    
    
    while (posicaoInsercao < tamanhoLogico && lista[posicaoInsercao] >= novoValor) {
        posicaoInsercao++;

    }

    for (int i = tamanhoLogico; i > posicaoInsercao; i--) {

        lista[i] = lista[i - 1];
    }

    lista[posicaoInsercao] = novoValor;


    return tamanhoLogico + 1;
}