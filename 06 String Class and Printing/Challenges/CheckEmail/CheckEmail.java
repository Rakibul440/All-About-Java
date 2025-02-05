/* 1. Check if the email id is on gmail or not
 * 2. Find username and domain name from email id
 */

import java.util.Scanner;

public class CheckEmail {
    public static void main(String[] args) {
        String email;
        System.out.print("Enter your email address: ");
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
        sc.close();

        if(email.matches("[a-z0-9]*@gmail.com")) {
            System.out.println("Email is on Gmail");

            //username
            String username = email.substring(0,email.indexOf("@"));
            System.out.println("Username : " + username);

            //Domain name
            String domain = email.substring(email.indexOf("@"),email.length());
            System.out.println("Domain : " + domain);

        } else {
            System.out.println("Email is not on Gmail");
        }

    }
}
