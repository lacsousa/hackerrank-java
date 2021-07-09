import java.util.Scanner;

public class ArrayDS {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        if(n < 1 || n > Math.pow(10,3)) {
            System.exit(0);
        }

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        for (int arrItr = (n -1) ; arrItr >=0 ; arrItr--){
            System.out.print(arr[arrItr] + " ");

        }

    }
}
