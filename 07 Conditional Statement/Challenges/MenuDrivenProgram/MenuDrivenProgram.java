import java.util.Scanner;
public class MenuDrivenProgram {
    public static void main(String[] args) {
        String Menu  = """
                Choose any operation below :-
                1. ADD
                2. SUB
                3. MUL
                4. DIV
                """;
        System.out.print(Menu +"\nEnter option in words : ");
        String options;
        int num_1 , num_2 , result;
        Scanner sc = new Scanner(System.in);
        options = sc.nextLine();
        System.out.println("Enter two numbers :");
        num_1 = sc.nextInt();
        num_2 = sc.nextInt();
        sc.close();

        switch(options.toUpperCase()){
            case "ADD" :
                result = num_1 + num_2;
                System.out.println("Addition : "+result);
                break;
            case "SUB" :
                result = num_1 - num_2;
                System.out.println("Subtraction : "+result);
                break;
            case "MUL" :
                result = num_1 * num_2;
                System.out.println("Multiplication : "+result);
                break;
            case "DIV" :
                result = num_1 / num_2;
                System.out.println("Divition : "+result);
                break;
            default:
                System.out.println("Invalid Choice!");

        }
    }
}
