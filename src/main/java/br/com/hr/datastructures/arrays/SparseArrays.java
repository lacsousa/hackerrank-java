package br.com.hr.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SparseArrays {

    private static final Scanner scan = new Scanner(System.in);
    // private static int achou=0;
    private static List<String> strings = new ArrayList<>();
    private static List<String> queries = new ArrayList<>();
    
    public static void main(String[] args) {

        System.out.println("Número de elementos n");
        int n = scan.nextInt(); 
        if(n <1 || n > Math.pow(10,3)){
            System.exit(0);
        }

        String[] arrStrings = new String[n];
        
        System.out.println("Strings");
        for (int i =0; i < n; i++) { 
            String s = scan.next();
            arrStrings[i] = s;
        }
        
        System.out.println("Número de queries q");
        int q = scan.nextInt(); 
        if(q <1 || q > Math.pow(10,3)){
            System.exit(0);
        }
        
        String[] arrQueries = new String[q];
        System.out.println("Queries");
        for (int x =0; x < q; x++) { 
            String que = scan.next();
            arrQueries[x] = que;
        }

        int[] resultado = new int[q];
        System.out.println("Resultado das queries");
        
        strings = Arrays.asList(arrStrings);
        queries = Arrays.asList(arrQueries);

        for (int i=0 ; i < q; i++){ //queries
            // procura queries em todas as Strings
            for (int j=0; j < n; j++){ // strings
                if(queries.get(i).equals(strings.get(j))) { 
                //  strings[j].contains(queries[i])){
                    resultado[i] += 1;
                }
            }
            System.out.println(resultado[i]);
        }
        scan.close();
    }

}
