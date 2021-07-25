package br.com.hr.datastructures.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MaxSumHourGlass3 {
    public static void main(String[] args) throws IOException {

        List<List<Integer>> lista = new ArrayList<>();

        lista.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        lista.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        lista.add(Arrays.asList(1, 1, 1, 0, 0, 0 ));
        lista.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        lista.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        lista.add(Arrays.asList(0, 0, 1, 2, 4, 0));

        int result = hourglassSum(lista);
        System.out.println(result);

    }

    public static int hourglassSum(List<List<Integer>> lista) {
        int soma = 0;
        int maiorSoma = Integer.MIN_VALUE;

        for (int lin = 0; lin < 4; lin++) {
            for (int col = 0; col < 4; col++) {
                // matriz HourGlass
                soma += lista.get(lin).get(col);
                printElemento(lista.get(lin).get(col));

                soma += lista.get(lin).get(col + 1);
                printElemento(lista.get(lin).get(col + 1));

                soma += lista.get(lin).get(col + 2);
                printElemento(lista.get(lin).get(col + 2));
                System.out.println();


                soma += lista.get(lin + 1).get(col + 1);
                System.out.print("  " + lista.get(lin + 1).get(col + 1));
                System.out.println();

                soma += lista.get(lin + 2).get(col);
                printElemento(lista.get(lin + 2).get(col));

                soma += lista.get(lin + 2).get(col + 1);
                printElemento(lista.get(lin + 2).get(col + 1));

                soma += lista.get(lin + 2).get(col + 2);
                printElemento(lista.get(lin + 2).get(col + 2));
                System.out.println();           
                System.out.println("  ----  ");
                System.out.println("Soma dessa > " + soma);

                if (soma > maiorSoma) {
                    maiorSoma = soma;
                }
                soma = 0;
                System.out.println();
            }
        }
       
        return maiorSoma;
    }



    public static void printElemento(int elemento) { 
        System.out.print(elemento + " ");
    }

}
