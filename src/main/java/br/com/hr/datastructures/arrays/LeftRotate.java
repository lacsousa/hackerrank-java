package br.com.hr.datastructures.arrays;

import java.util.Scanner;

public class LeftRotate {

  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] lista = scanner.nextLine().split(" ");

        int n = Integer.parseInt(lista[0]);
        if(n <1 || n > Math.pow(10,5)){
            System.exit(0);
        }

        int d = Integer.parseInt(lista[1]);
        if(d < 0 || d> n) {
            System.exit(0);
        }

        int[] a = new int[n];
        String[] listaItems = scanner.nextLine().split(" ");
        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(listaItems[arrItr].trim());
            if(arrItem >=1 || arrItem <= Math.pow(10,6)){
                a[arrItr] = arrItem;
            }
        }

        int [] newArr = rotateLeft(a, d);
        for (int i = 0 ; i < newArr.length ; i++){
            System.out.print(newArr[i] + " ");

        }
        scanner.close();
    }

    private static int[] rotateLeft(int[] a, int numRotations) {
        int[] newArray = new int[a.length];
        for(int i=0; i < a.length; i++){
            newArray [i] = a[(i+numRotations) % a.length];
        }
    return newArray;
    }
}
