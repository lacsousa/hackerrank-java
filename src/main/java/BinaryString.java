public class BinaryString {

    BinaryString(String string){
        for( byte b : string.getBytes() ){
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }

    BinaryString(Integer integer){
        System.out.println(Integer.toBinaryString(integer));
    }

    public static void main(String[] args) {
        new BinaryString("HackerRank");
        new BinaryString(8675309);
        new BinaryString2("HackerRank", 8675309);
    }
}

class BinaryString2 {

    BinaryString2(String string, Integer integer){
        String binaryInteger = Integer.toBinaryString(integer);

        for( byte b : string.getBytes() ){
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b | integer;
            System.out.println( Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer)
                    + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
        }
    }

}
