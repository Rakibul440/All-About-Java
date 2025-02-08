/* Arguments we put with command  
Ex . java CommandLineArgs Baccha Meye 
Here "Baccha" and "Meye" both are arguments
*/ 
public class CommandLineArgs {
    public static void main(String[] args) {

        // Find Sum with comand line arguments
        double sum = 0;
        for(String word : args){
            double number = Double.parseDouble(word);
            sum += number;
        }
        System.out.println("Sum of your number is : "+sum);
    }
}
