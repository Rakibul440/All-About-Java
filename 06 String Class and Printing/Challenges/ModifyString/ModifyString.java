/* Remove special characters from a string
 * Remove extra spaces from string
 * Find number of words in a string
 */
public class ModifyString {
    public static void main(String[] args) {
        String str1 = "A@b45#n%H^&k*K";
        String str2 = "    Rakibul     Islam          Mondal     ";
        String str3 = "I love you baccha meye";

        String words[] = str3.split("\\s");

        System.out.println("Modified string by removing special character : "+ str1.replaceAll("[^A-Z0-9a-z]", "").trim());
        System.out.println("Modified string by trimming extra space : "+ str2.replaceAll("\\s+", " "));
        System.out.println("No of words : " + words.length);
    }
}
