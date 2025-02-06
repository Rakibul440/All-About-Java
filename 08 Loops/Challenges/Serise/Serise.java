/* Display AP serise
 * Display GP serise
 * Display Fibonacci Serise
 */

import java.util.Scanner;

public class Serise {
    public static void main(String[] args) {
        System.out.println("***************Display Serise*******************");
        Scanner sc = new Scanner(System.in);
        int a , cd , n;
        System.out.println("Enter first term , common difference and total number of term : ");
        a = sc.nextInt();
        cd = sc.nextInt();
        n = sc.nextInt();

        
        int APterm = 0;
        System.out.println("Your AP serise is :-");
        for(int i = 1; i < n ; i++){
            APterm = (a + (i-1) * cd);
            System.out.print(APterm + ",");
        }
        System.out.println("");
        System.out.println("Enter Common ratio : ");
        int r;
        r = sc.nextInt();

        //GP Serise
        System.out.println("Your GP serise is :-");
        for(int i = 0 ; i < n ; i++){
            System.out.print(a + ",");
            a *= r;
        }
        System.out.println("");

        //Fibonacchi Serise
        int term_1 = 0, term_2 = 1;
        int next_term;
        System.out.println("Fibonacchi serise is :-");
        System.out.print(term_1 + "," + term_2 + ",");
        for(int i = 1; i < n ; i++){
            next_term = term_1 + term_2;
            term_1 = term_2;
            term_2 = next_term;

            System.out.print(next_term + ",");
        }
        
        sc.close();
    }
}
