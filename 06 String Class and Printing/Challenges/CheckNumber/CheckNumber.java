/* Find is a number is Binary or not
 * Find is a Number is Hexa-Decimal or not
 * Find is the date is Data format (dd/mm/yyyy) or not
 */
public class CheckNumber {
    public static void main(String[] args) {
        String binary = "101011";
        String hexaDecimal = "0xAF008";
        String date = "29/12/2002";

        if(binary.matches("[0-1]*")){
            System.out.println("It's a Binary number");
        }
        if(hexaDecimal.matches("0x{1}[0-9A-F]*")){
            System.out.println("It's a Hexa-Decimal number");
        }
        if(date.matches("[0-2][0-9]/[0-1][0-2]/[0-9]{4}")){
            System.out.println("It's a Date");
        }
    }
}
