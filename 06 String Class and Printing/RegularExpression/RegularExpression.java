public class RegularExpression {
    public static void main(String[] args) {
        // Regular Expression
        // . - Any character
        String str1 = "a" ;
        System.out.println("1 " + str1.matches("."));

        // [ABC] - Any character from the list
        String str2 = "A" ;
        System.out.println("2 " + str2.matches("[ABC]"));

        // [^ABC] - Any character not from the list
        String str3 = "D"  ;
        System.out.println("3 " + str3.matches("[^ABC]"));

        // [A-Z] - Any character from the range
        String str4 = "A" ;
        System.out.println("4 " + str4.matches("[A-Z]"));
        System.out.println("5 " + str4.matches("[0-9]")); // false

        //[a-z0-9] - Any character from the range
        String str5 = "9" ;
        System.out.println("6 " + str5.matches("[a-z0-9]"));

        // [a-z][0-9] - Two character- one from first list and other from second list
        String str6 = "a9" ;
        System.out.println("7 " + str6.matches("[a-z][0-9]"));

        // \\d - Any digit
        String str7 = "9" ;
        System.out.println("8 " + str7.matches("\\d"));

        // a|b - Any character either a or b
        String str8 = "b" ;
        System.out.println("9 " + str8.matches("a|b"));

        // "abc" - exactly abc
        String str9 = "abc";
        System.out.println("10 " + str9.matches("abc"));

        // Example
        String email = "rakibul123@gmail.com";
        System.out.println("11 " + email.matches("[a-zA-Z0-9]+@gmail+\\.com+"));

    }
}
