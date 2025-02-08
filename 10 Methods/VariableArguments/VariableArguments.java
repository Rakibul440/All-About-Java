
public class VariableArguments {
    static void show(int ...A){
        for (int x : A) {
            System.out.println(x);
        }
    }
    static void printList(String ...word){
        for(int i = 0; i < word.length ; i++){
            System.out.println(i+1 +". " + word[i]);
        }
    }
    public static void main(String[] args) {

        System.out.println("Variable arguments:");

        show();

        System.out.println("Let's call again!");

        show(07,02,2005);
        System.out.println("Show the list : ");
        printList("Rijiya","Rakibul");
    }
}
