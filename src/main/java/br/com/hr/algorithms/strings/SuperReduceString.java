package br.com.hr.algorithms.strings;

import java.util.Scanner;

public class SuperReduceString {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = "aabc";
        // String s = scan.next();

        String s1 = "aaabccddd";
        String s2 = "abba"; 
        String s3 = "a";
        if (s.length() < 1 || s.length() > 100) {
            System.exit(0);
        }
        scan.close();
        reduzString(s);
        reduzString(s1);
        reduzString(s2);
        reduzString(s3);
    }

    private static void reduzString(String str) {
       
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                str = str.substring(0, i - 1) + str.substring(i + 1);
                i = 0;
            }
        }
        if (str.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(str);
        }
    }
}
