/* Multiplicaiton Table */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number of which multiplication table you want :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        System.out.println("Here is your table :-");
        for(int i=1;i<=10;i++){
            System.out.print(number*i + "\t");
        }
    }
}
