/* Find type of website
 * And the protocal used in the website
 */
import java.util.Scanner;

public class WebsiteInfo {
    public static void main(String[] args) {
        String websiteUrl;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your websiteUrl : ");
        websiteUrl = sc.nextLine();
        sc.close();

        //check valid url

        if(websiteUrl.startsWith("https://www.") || websiteUrl.startsWith("http://www.") || websiteUrl.startsWith("ftp://www.")){

            //find protocal
            if(websiteUrl.startsWith("http:")){
                System.out.println("This website used 'Hyper Text Transfer Protocal'");
            }
            else if(websiteUrl.startsWith("https:")){
                System.out.println("This website used 'Hyper Text Transfer Secure Protocal'");
            }
            else if(websiteUrl.startsWith("ftp:")){
                System.out.println("This website used 'File Transfer Protocal'");
            }

            //find Domain
            if(websiteUrl.endsWith(".gov")){
                System.out.println("It's a Government website");
            }
            else if(websiteUrl.endsWith(".org")){
                System.out.println("It's a website of an organization");
            }
            else if(websiteUrl.endsWith(".in")){
                System.out.println("It's an Indian website");
            }
            else if(websiteUrl.endsWith(".uk")){
                System.out.println("It's a website under united kingdom");
            }
            else if(websiteUrl.endsWith(".com")){
                System.out.println("It's a commercial website");
            }
            else{
                System.out.println("It's a website with unknown domain");
            }
        }
        else{
            System.out.println("Enter a valid Url");
        }
    }    
}
