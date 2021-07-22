package br.com.hr.datastructures.arrays;

public class MaxSumHourGlass {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        int n = 6;
        int valor = 0;

        int arr[][] = new int[n][n];
//        for(int i=0; i < n; i++){
//            for(int j=0; j < n; j++){
//                valor = in.nextInt();
//                if (valor >=-9 && valor<=9){
//                    arr[i][j] = valor;
//                }
//            }
//        }

        arr = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        imprimeMatrizes3por3(n, arr);
    }

    private static void imprimeMatrizes3por3(int n, int[][] arr) {
        int a = 0;
        int b = 0;
        int soma=0;
        int maiorSoma = Integer.MIN_VALUE;

        for(int lin=0; lin<(n-2); lin++){
            for(int col=0; col<(n-2); col++) {
                for (int i = lin; i < lin + 3; i++) {
                    for (int j = col; j < col+ 3; j++) {
                        if((a==1) && (a!=b)){
                            System.out.print("  ");
                        }else{
                            System.out.print(arr[i][j] + " ");
                            soma += arr[i][j];
                        }
                        b++;
                    }
                    b=0;
                    a++;
                    System.out.println();
                }
                if(soma> maiorSoma){
                    maiorSoma = soma;
                }
                soma=0;
                System.out.println("---------");
                a=0;
            }
        }
        System.out.println(maiorSoma);
    }

}
