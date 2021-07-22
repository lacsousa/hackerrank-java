package br.com.hr.datastructures.arrays;

public class MaxSumHourGlass2 {

    public static void main(String[] args) {

        int n = 6;

        int arr[][] = new int[n][n];

        arr = new int[][] { 
            { 1, 1, 1, 0, 0, 0 }, 
            { 0, 1, 0, 0, 0, 0 }, 
            { 1, 1, 1, 0, 0, 0 }, 
            { 0, 0, 2, 4, 4, 0 },
            { 0, 0, 0, 2, 0, 0 }, 
            { 0, 0, 1, 2, 4, 0 } 
        };
        somaMatrizes3por3(n, arr);
    }

    private static void somaMatrizes3por3(int n, int[][] arr) {
       
        int soma = 0;
        int maiorSoma = Integer.MIN_VALUE;

        for (int lin = 0; lin < (n - 2); lin++) {
            for (int col = 0; col < (n - 2); col++) {
                // matriz HourGlass
                soma += arr[lin][col];
                printElemento(arr[lin][col]);

                soma += arr[lin][col+1];
                printElemento(arr[lin][col+1]);

                soma += arr[lin][col+2];
                printElemento(arr[lin][col+2]);
                System.out.println();

                soma += arr[lin+1][col+1];
                System.out.print("  " + arr[lin+1][col+1]);
                System.out.println();

                soma += arr[lin+2][col];
                printElemento(arr[lin+2][col]);

                soma += arr[lin+2][col+1];
                printElemento(arr[lin+2][col+1]);

                soma += arr[lin+2][col+2];
                printElemento(arr[lin+2][col+2]); 
                System.out.println();           
                System.out.println("  ----  ");
                System.out.println("Soma dessa > " + soma);
                
                if (soma > maiorSoma) { 
                    maiorSoma = soma;
                }
                soma=0;
                System.out.println();
            }
        }
         System.out.println(maiorSoma);
    }

    private static void printElemento(int elemento) { 
        System.out.print(elemento + " ");
    }

}
