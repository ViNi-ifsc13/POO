void main(){

    // um vetor em Java é um objeto
    int[] vetor = new int[5]; // todas as posições começam com o valor 0

    int tamanho = vetor.length;

    vetor[0] = 10;
    vetor[4] = 90;

    int[] outra = {3, 4, 6, 7}; // new int[]{1, 2, 3, 4}

    int[][] matrizTeste = new int[3][2]; // linha,coluna

    matrizTeste[2][1] = 50;


    int[] vetor2 = {3, 4, 6, 100};

    for (int i = 0; i < vetor2.length; i++) {
        System.out.println(vetor2[i]);
    }

    for (int i : vetor2) {
        System.out.println(i);
    }

    // vetor de 100 posições que inicie com números ímpares, começando em 3


    int[] impares = new int[100];
    impares[0] = 3;

    for(int i = 1; i < 100; i++){
        impares[i] = impares[i - 1] + 2;
        System.out.println(impares[i - 1]);        
    }  

}