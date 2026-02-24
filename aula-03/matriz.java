void main (){

        

    int[][]matriz = {
        {1,2,3}, 
        {4,5,6}, 
        {7,8,9}
    };

    matriz[0][0] = 1;

    // matriz com for
    // int contador = 1;

    for (int i = 0; i < 3; i++) { // linhas
        for (int j = 0; j < 3; j++) { // colunas

            if(i==j) // para imprimir tudo basta tirar o if e o else
                System.out.print(matriz[i][j] + " ");
                // matriz[i][j] = contador++;
                else
                    System.out.print(" ");       
        }
                System.out.println();
            
    }

}